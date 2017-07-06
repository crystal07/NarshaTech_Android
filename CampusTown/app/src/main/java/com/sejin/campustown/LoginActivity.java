package com.sejin.campustown;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.sejin.campustown.data.ItnlPhoneNumData;
import com.sejin.campustown.data.UserData;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import static android.content.ContentValues.TAG;


public class LoginActivity extends Activity {

    Button btnOK;
    HashMap<String, String > intl;
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnOK= (Button)findViewById(R.id.btnOK);

        intl = new HashMap<String, String>();
        JSONArray jarray = null;
        try {
            jarray = new JSONArray(ItnlPhoneNumData.intlPhoneNumData);

            for (int i=0; i<jarray.length(); i++) {
                JSONObject jObject = jarray.getJSONObject(i);

                String code = jObject.getString("code");
                String country = jObject.getString("name");
                intl.put(country, code);

                Log.e("Map Test", "onCreate: "+intl.size()+" : " + country + "/" + code);
            }

        }
        catch (JSONException e) {
            e.printStackTrace();
        }

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(((EditText)findViewById(R.id.etId)).getText().toString().length() < 6 || ((EditText)findViewById(R.id.etId)).getText().toString().length() > 14){

                    return;
                }
                else if(((EditText)findViewById(R.id.etPassword)).getText().toString().length() < 8 || ((EditText)findViewById(R.id.etPassword)).getText().toString().length() > 17){
                    return;
                }
                else if(((EditText)findViewById(R.id.etEmail)).getText().toString().length() > 40 ){
                    return;
                }
                else if(((EditText)findViewById(R.id.etName)).getText().toString().length() > 30 ){
                    return;
                }
                else if(((EditText)findViewById(R.id.etPhone)).getText().toString().length() > 15 ){
                    return;
                }
                else if(((EditText)findViewById(R.id.etBirthday)).getText().toString().length() !=8 ){
                    return;
                }
                else if (((RadioGroup)findViewById(R.id.rgGender)).getCheckedRadioButtonId() == -1) {
                    return;

                }
                String userGender;
                if (((RadioButton)findViewById(R.id.rbMale)).isChecked()) userGender="Male";
                else userGender= "Female";


                userData= new UserData(
                        ((EditText) findViewById(R.id.etId)).getText().toString(),
                        ((EditText)findViewById(R.id.etPassword)).getText().toString(),
                        ((EditText)findViewById(R.id.etEmail)).getText().toString(),
                        ((EditText)findViewById(R.id.etName)).getText().toString(),
                        ((EditText)findViewById(R.id.etPhone)).getText().toString(),
                        ((EditText)findViewById(R.id.etBirthday)).getText().toString(),
                        userGender);

                Log.e(TAG, "onClick: "+ userData.toString());

            }
        });



    }



}
