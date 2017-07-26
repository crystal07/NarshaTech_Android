package com.sejin.cnctown;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.sejin.cnctown.adapter.ReviewRcvAdapter;
import com.sejin.cnctown.data.DummyData;

public class ActDetailActivity extends AppCompatActivity {

    final String TAG = "Test";
    final int PLACE_PICKER_REQUEST = 1;
    final int MY_PER_RC1 = 1001;
    final int MY_PER_RC2 = 1002;
    final int MY_PER_RC3 = 1003;

    private Button mBtnTmp;
    private PlacePicker.IntentBuilder mBuilder;
    private RecyclerView mRcvReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_detail);

        mBtnTmp = (Button) findViewById(R.id.detailA_btn_place);
        mRcvReview = (RecyclerView) findViewById(R.id.detailA_rcv_review);
        mRcvReview.setLayoutManager(new LinearLayoutManager(this));
        mRcvReview.setAdapter(new ReviewRcvAdapter(DummyData.reviewDummyList));















        mBtnTmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mBuilder = new PlacePicker.IntentBuilder();

                if (permissionChecker()) {
                    try {
                        Log.e(TAG, "onClick: 45");
                        startActivityForResult(mBuilder.build(ActDetailActivity.this), PLACE_PICKER_REQUEST);
                    } catch (GooglePlayServicesRepairableException e) {
                        Log.e(TAG, "onClick:51 " + e.getMessage());
                        e.printStackTrace();
                    } catch (GooglePlayServicesNotAvailableException e) {
                        Log.e(TAG, "onClick: 53" + e.getMessage());
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        Log.e(TAG, "onRequestPermissionsResult: 1");
        switch (requestCode) {
            case MY_PER_RC1: {
                if ((grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) && (grantResults.length > 1 && grantResults[1] == PackageManager.PERMISSION_GRANTED)) {
                    mBuilder = new PlacePicker.IntentBuilder();
                    try {
                        startActivityForResult(mBuilder.build(ActDetailActivity.this), PLACE_PICKER_REQUEST);
                    } catch (GooglePlayServicesRepairableException e) {
                        e.printStackTrace();
                    } catch (GooglePlayServicesNotAvailableException e) {
                        e.printStackTrace();
                    }
                    return;
                } else {
                    return;
                }
            }
            case MY_PER_RC2: {
                if ((grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    mBuilder = new PlacePicker.IntentBuilder();
                    try {
                        startActivityForResult(mBuilder.build(ActDetailActivity.this), PLACE_PICKER_REQUEST);
                    } catch (GooglePlayServicesRepairableException e) {
                        e.printStackTrace();
                    } catch (GooglePlayServicesNotAvailableException e) {
                        e.printStackTrace();
                    }
                    return;
                } else {
                    return;
                }
            }
            case MY_PER_RC3: {
                if ((grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    mBuilder = new PlacePicker.IntentBuilder();
                    try {
                        startActivityForResult(mBuilder.build(ActDetailActivity.this), PLACE_PICKER_REQUEST);
                    } catch (GooglePlayServicesRepairableException e) {
                        e.printStackTrace();
                    } catch (GooglePlayServicesNotAvailableException e) {
                        e.printStackTrace();
                    }
                    return;
                } else {
                    return;
                }
            }
        }
    }

    private boolean permissionChecker() {
        Log.e(TAG, "permissionChecker: 119");
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
            Log.e(TAG, "permissionChecker: 122");
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    Log.e(TAG, "permissionChecker: 126");
                    ActivityCompat.requestPermissions(
                            ActDetailActivity.this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.INTERNET},
                            MY_PER_RC1);
                }
            };
            run.run();
            return false;

        } else if ((ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) && (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED)) {
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    Log.e(TAG, "permissionChecker: 98");
                    ActivityCompat.requestPermissions(
                            ActDetailActivity.this,
                            new String[]{Manifest.permission.INTERNET},
                            MY_PER_RC3);
                }
            };
            run.run();
            return false;

        } else if ((ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) && (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.INTERNET) == PackageManager.PERMISSION_GRANTED)) {

            Runnable run = new Runnable() {
                @Override
                public void run() {
                    Log.e(TAG, "permissionChecker: 143");
                    ActivityCompat.requestPermissions(
                            ActDetailActivity.this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                            MY_PER_RC2);
                }
            };

            run.run();
            return false;

        }
        Log.e(TAG, "permissionChecker: END");
        return true;
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PLACE_PICKER_REQUEST) {
            if (resultCode == RESULT_OK) {

                Place place = PlacePicker.getPlace(data, this);
                String toastMsg = String.format("Place: %s", place.getName());
                Toast.makeText(this, toastMsg, Toast.LENGTH_LONG).show();
            }
        }
    }

}
