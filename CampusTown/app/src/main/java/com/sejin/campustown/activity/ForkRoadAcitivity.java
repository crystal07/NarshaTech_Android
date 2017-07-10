package com.sejin.campustown.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sejin.campustown.R;

public class ForkRoadAcitivity extends AppCompatActivity {

    Button mBtnMeetTrip;
    Button mBtnMembership;
    Button mBtnPlanTrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fork_road_acitivity);

        mBtnMeetTrip=(Button)findViewById(R.id.btnMeetTrip);
        mBtnMembership=(Button)findViewById(R.id.btnMembership);
        mBtnPlanTrip=(Button)findViewById(R.id.btnPlanTrip);

        mBtnMeetTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ForkRoadAcitivity.this,TempTripActivity.class));
            }
        });
        mBtnPlanTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForkRoadAcitivity.this,AddTripActivity.class));
            }
        });
    }
}
