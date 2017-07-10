package com.sejin.campustown.data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.concurrent.RecursiveAction;

import static android.R.attr.name;

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


    public boolean isValid(Context context) {
        if (mName == null) {
            Toast.makeText(context, "이름은 필수 항목 입니다.", Toast.LENGTH_SHORT).show();
            return false;
        } else if (mDescription==null) {
            Toast.makeText(context, "설명은 필수 항목입나다.", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}
