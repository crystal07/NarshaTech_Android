package com.sejin.campustown;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.gson.Gson;
import com.sejin.campustown.data.ItnlPhoneNumData;

import net.rimoto.intlphoneinput.IntlPhoneInput;

import java.util.ArrayList;

public class LoginActivity extends Activity {

    Button btnOK= (Button)findViewById(R.id.btnOK);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }



}
