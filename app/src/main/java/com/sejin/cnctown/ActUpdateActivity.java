package com.sejin.cnctown;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.sejin.cnctown.data.Manager;

public class ActUpdateActivity extends AppCompatActivity {

    private ImageButton mBtnTmp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_update);

        mBtnTmp = (ImageButton) findViewById(R.id.update_btn_add_place);

        mBtnTmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PlacePicker.IntentBuilder mBuilder = new PlacePicker.IntentBuilder();

                try {
                    startActivityForResult(mBuilder.build(ActUpdateActivity.this), Manager.RC_PLACE_PICKER);
                } catch (GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                } catch (GooglePlayServicesNotAvailableException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}




