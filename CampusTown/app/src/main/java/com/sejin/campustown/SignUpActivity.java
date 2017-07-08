package com.sejin.campustown;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.sejin.campustown.data.IntlPhoneNumData;
import com.sejin.campustown.data.UserData;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import static android.content.ContentValues.TAG;


public class SignUpActivity extends Activity {

    Button mBtnOK;
    EditText mEtId, mEtPassword, mEtEmail, mEtName, mEtPhone, mEtBirthday;
    RadioGroup mRgGender;
    HashMap<String, String> intl;
    UserData userData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        mEtId = (EditText) findViewById(R.id.etId);
        mEtPassword = (EditText) findViewById(R.id.etPassword);
        mEtEmail = (EditText) findViewById(R.id.etEmail);
        mEtName = (EditText) findViewById(R.id.etName);
        mEtPhone = (EditText) findViewById(R.id.etPhone);
        mEtBirthday = (EditText) findViewById(R.id.etBirthday);
        mRgGender = (RadioGroup) findViewById(R.id.rgGender);
        mBtnOK = (Button) findViewById(R.id.btnOK);
        intl = new HashMap<String, String>();

        JSONArray jarray = null;
        try {
            jarray = new JSONArray(IntlPhoneNumData.intlPhoneNumData);

            for (int i = 0; i < jarray.length(); i++) {
                JSONObject jObject = jarray.getJSONObject(i);

                String code = jObject.getString("code");
                String country = jObject.getString("name");
                intl.put(country, code);

                Log.e("Map Test", "onCreate: " + intl.size() + " : " + country + "/" + code);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        mBtnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mEtId.getText().toString().length() < 6 || mEtId.getText().toString().length() > 14) {
                    Toast.makeText(SignUpActivity.this, "Please enter between 6 and 14 characters", Toast.LENGTH_SHORT).show();
                    return;
                } else if (mEtPassword.getText().toString().length() < 8 || mEtPassword.getText().toString().length() > 17) {
                    Toast.makeText(SignUpActivity.this, "Please enter between 8 and 17 characters", Toast.LENGTH_SHORT).show();
                    return;
                } else if (mEtEmail.getText().toString().length() > 40) {
                    Toast.makeText(SignUpActivity.this, "Please enter between 6 and 14 characters", Toast.LENGTH_SHORT).show();
                    return;
                } else if (mEtName.getText().toString().length() > 30) {
                    Toast.makeText(SignUpActivity.this, "Please enter less than 30 characters.", Toast.LENGTH_SHORT).show();
                    return;
                } else if (mEtPhone.getText().toString().length() > 15) {
                    Toast.makeText(SignUpActivity.this, "Please enter less than 15 numbers.", Toast.LENGTH_SHORT).show();
                    return;
                } else if (mEtBirthday.getText().toString().length() != 8) {
                    Toast.makeText(SignUpActivity.this, "Please enter 8-digit birthday.", Toast.LENGTH_SHORT).show();
                    return;
                } else if (((RadioGroup) findViewById(R.id.rgGender)).getCheckedRadioButtonId() == -1) {
                    Toast.makeText(SignUpActivity.this, "Please check your gender", Toast.LENGTH_SHORT);
                    return;

                }
                String userGender;
                if (((RadioButton) findViewById(R.id.rbMale)).isChecked()) userGender = "Male";
                else userGender = "Female";


                userData = new UserData(
                        ((EditText) findViewById(R.id.etId)).getText().toString(),
                        ((EditText) findViewById(R.id.etPassword)).getText().toString(),
                        ((EditText) findViewById(R.id.etEmail)).getText().toString(),
                        ((EditText) findViewById(R.id.etName)).getText().toString(),
                        ((EditText) findViewById(R.id.etPhone)).getText().toString(),
                        userGender,
                        ((EditText) findViewById(R.id.etBirthday)).getText().toString()
                        );

                Log.e(TAG, "onClick: " + userData.toString());


                InsertData task = new InsertData();
                //정보 삽입
                task.execute(
                        userData.getId(),
                userData.getPassword(),
                userData.getEmail(),
                userData.getName(),
                userData.getPhone(),
                userData.getGender(),
                userData.getBirth(),
                userData.getType(),
                userData.getUniversity());


            }
        });


    }


    class InsertData extends AsyncTask<String, Void, String> {
        ProgressDialog progressDialog;

        // 일단 이건 댐
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = ProgressDialog.show(SignUpActivity.this,
                    "Please Wait", null, true, true);
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            progressDialog.dismiss();
            Log.d(TAG, "POST response ff - " + result);
        }

        @Override
        protected String doInBackground(String... params) {

            String id = (String) params[0];
            String password = (String) params[1];
            String email = (String) params[2];
            String name = (String) params[3];
            String phone = (String) params[4];
            String gender = (String) params[5];
            String birthday = (String) params[6];
            String type = (String) params[7];
            String university= (String) params[8];

            Log.e(TAG, "doInBackground: "+email );

            String serverURL = "http://10.0.2.2/insert.php";
            String postParameters =
                    "id=" + id
                            + "&password=" + password
                            + "&email=" + email
                            + "&name=" + name
                            + "&phone=" + phone
                            + "&gender=" + gender
                            + "&university" + university
                            + "&type" + type
                            + "&birth=" + birthday;


            try {

                URL url = new URL(serverURL);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();


                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setRequestMethod("POST");
                //httpURLConnection.setRequestProperty("content-type", "application/json");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();


                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(postParameters.getBytes("UTF-8"));
                outputStream.flush();
                outputStream.close();


                int responseStatusCode = httpURLConnection.getResponseCode();
                Log.d(TAG, "POST response code - " + responseStatusCode);

                InputStream inputStream;
                if (responseStatusCode == HttpURLConnection.HTTP_OK) {
                    inputStream = httpURLConnection.getInputStream();
                } else {

                    Log.e(TAG, "doInBackground: 208  ");
                    inputStream = httpURLConnection.getErrorStream();
                }


                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuilder sb = new StringBuilder();
                String line = null;

                while ((line = bufferedReader.readLine()) != null) {
                    sb.append(line);
                }


                bufferedReader.close();


                return sb.toString();


            } catch (Exception e) {

                Log.d(TAG, "InsertData: Error ", e);

                return new String("Error: " + e.getMessage());
            }

        }
    }

}



