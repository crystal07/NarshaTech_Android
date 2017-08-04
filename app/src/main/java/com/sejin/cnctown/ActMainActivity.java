package com.sejin.cnctown;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sejin.cnctown.adapter.ActThumbRcvAdapter;
import com.sejin.cnctown.data.DummyData;

public class ActMainActivity extends AppCompatActivity {

    private RecyclerView mRcvActThumb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_main);


        mRcvActThumb=(RecyclerView)findViewById(R.id.main_rcv_thumb);
        mRcvActThumb.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        mRcvActThumb.setAdapter(new ActThumbRcvAdapter(getApplicationContext(), DummyData.actDummyList));

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
