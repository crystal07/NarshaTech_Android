package com.sejin.campustown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sejin.campustown.adapter.TripAdapter;
import com.sejin.campustown.data.TripData;

import java.util.ArrayList;

public class TempTripActivity extends AppCompatActivity {

    private RecyclerView mRvTrips;
    private ArrayList<TripData> tripDataArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_trip);

        ArrayList<TripData>tripDataArrayList =new ArrayList<TripData>();

        tripDataArrayList.add( new TripData("한양대","높고높은산"));
        tripDataArrayList.add( new TripData("세진이집","멋지고 까리한 사람이 살고 있어요"));
        tripDataArrayList.add( new TripData("IT BT관","탈출하고싶다"));
        tripDataArrayList.add( new TripData("크리에이티브랩 1번방","냄새 개쩜"));
        tripDataArrayList.add( new TripData("할게없엉","잰정"));


        mRvTrips=(RecyclerView)findViewById(R.id.rvTrips);
        mRvTrips.setLayoutManager(new LinearLayoutManager(TempTripActivity.this,LinearLayoutManager.HORIZONTAL, false));
        mRvTrips.setAdapter(new TripAdapter(TempTripActivity.this,tripDataArrayList));
    }




}
