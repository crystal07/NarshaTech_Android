package com.sejin.cnctown.data;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sejin on 2017. 7. 20..
 */

public class ReviewData
{
    private int activityIndex;
    private String id;
    private String review;
    @NonNull
    private String date;

    private float rating;

    public ReviewData(String id, String review, String date, float rating) {
        this.id = id;
        this.review = review;
        this.date=date;
        this.rating = rating;
    }

    public String getDate(){

        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat outputFormat = new SimpleDateFormat("yyyy. dd. MM");


        Date resDate = null;
        try {
            String inputDateStr=date;
            resDate = inputFormat.parse(inputDateStr);
            String outputDateStr = outputFormat.format(resDate);

            return outputDateStr;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }

    public int getActivityIndex() {
        return activityIndex;
    }

    public void setActivityIndex(int activityIndex) {
        this.activityIndex = activityIndex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }



    class HashTag{
        int activityIndex;
        String hash;
    }
}
