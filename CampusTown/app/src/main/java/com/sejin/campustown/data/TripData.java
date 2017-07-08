package com.sejin.campustown.data;

import android.support.v7.widget.RecyclerView;

import java.util.concurrent.RecursiveAction;

/**
 * Created by sejin on 2017. 7. 8..
 */

public class TripData {

    private String mName;
    private String mDescription;

    public TripData(String mName, String mDescription) {
        this.mName = mName;
        this.mDescription = mDescription;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
