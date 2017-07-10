package com.sejin.campustown.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sejin.campustown.R;
import com.sejin.campustown.data.DummyData;
import com.sejin.campustown.data.TripData;

public class AddTripActivity extends AppCompatActivity {

    EditText mEtName,mEtDesc;
    Button mBtnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_trip);

        mEtName=(EditText)findViewById(R.id.etName);
        mEtDesc=(EditText)findViewById(R.id.etDesc);
        mBtnAdd=(Button)findViewById(R.id.btnAdd);




        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TripData tripData= new TripData(mEtName.getText().toString(),mEtDesc.getText().toString());

                if (tripData.isValid(AddTripActivity.this)){
                    DummyData.tripDummyList.add(tripData);
                    Toast.makeText(AddTripActivity.this, "저장되었습니다.", Toast.LENGTH_SHORT).show();
                    finish();
                }

            }
        });

    }



}
