package com.sejin.campustown.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sejin.campustown.R;
import com.sejin.campustown.adapter.TripRcvAdapter;
import com.sejin.campustown.data.DummyData;

public class TempTripActivity extends AppCompatActivity {

    private RecyclerView mRvTrips,mRvPopuTrips,mRvRegionTrips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_trip);

        /** 음
         * 젠장할 ㅎㅎ
         *
         * ㅇㄴㅁ릏
         */

        mRvTrips=(RecyclerView)findViewById(R.id.rvTrips);
        mRvTrips.setLayoutManager(new LinearLayoutManager(TempTripActivity.this,LinearLayoutManager.HORIZONTAL, false));
        mRvTrips.setAdapter(new TripRcvAdapter(TempTripActivity.this, DummyData.tripDummyList));

        mRvPopuTrips=(RecyclerView)findViewById(R.id.rvPopuTrips);
        mRvPopuTrips.setLayoutManager(new LinearLayoutManager(TempTripActivity.this,LinearLayoutManager.HORIZONTAL, false));
        mRvPopuTrips.setAdapter(new TripRcvAdapter(TempTripActivity.this, DummyData.popuTripDummyList));

        mRvRegionTrips=(RecyclerView)findViewById(R.id.rvRegionTrips);
        mRvRegionTrips.setLayoutManager(new LinearLayoutManager(TempTripActivity.this,LinearLayoutManager.HORIZONTAL, false));
        mRvRegionTrips.setAdapter(new TripRcvAdapter(TempTripActivity.this, DummyData.regionTripDummyList));

    }

    @Override
    protected void onResume() {
        super.onResume();

        mRvTrips.setAdapter(new TripRcvAdapter(TempTripActivity.this,DummyData.tripDummyList));
    }
}
