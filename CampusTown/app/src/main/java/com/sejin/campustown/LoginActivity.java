package com.sejin.campustown;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.sejin.campustown.data.ItnlPhoneNumData;

import net.rimoto.intlphoneinput.IntlPhoneInput;

import java.util.ArrayList;

public class LoginActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        ITNL itnl= new Gson().fromJson(ItnlPhoneNumData.lntlPhoneNumData,ITNL.class);

        Log.e("TAG", "onCreate: "+itnl.itnlList.get(5));

    }


    private class ITNL{
        private ArrayList<EachData> itnlList;
        //gg
        private class EachData{
            private String code,name;
        }
    }
}
