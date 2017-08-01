package com.sejin.cnctown.data;

import android.support.annotation.NonNull;

import java.util.ArrayList;

/**
 * Created by sejin on 2017. 7. 8..
 */

public class ActData {

    private String id;
    /*****************/
    private String title , //ㅇ
            category, //ㅇ
            actLocation;//ㅇ 활동 장소
    private ActLanguage actLanguage;
    private float actRating; //ㅇ
    /*****************/
    private float price; //o
    /*****************/
    private String actIntroduction; //o
    /*****************/
    private String meetingPlace; // 집합장소
    private int maximumCapacity; //ㅇ
    private float totalTime;//ㅇ
    /*****************/





    private float lastReadyTime;
    private String addtionalInformation;
    private ActSchedule actSchedule;
    private ActPicture actPicture;
    private ActReviewData actReviewData;

    public ActData() {

    }


    class ActLanguage {
        int ivityIndex;
        ArrayList<String> langList;
    }
    class ActSchedule {
        private int ivityIndex;
        private String location;
        private int startYear, startMonth, startDay, startHour, startMinute, endYear, endMonth, endDay, endHour, endMinute;
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIntroductin() {
            return introductin;
        }

        public void setIntroductin(String introductin) {
            this.introductin = introductin;
        }

        private String introductin;
        public int getActivityIndex() {
            return ivityIndex;
        }

        public void setActivityIndex(int ivityIndex) {
            this.ivityIndex = ivityIndex;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public int getStartYear() {
            return startYear;
        }

        public void setStartYear(int startYear) {
            this.startYear = startYear;
        }

        public int getStartMonth() {
            return startMonth;
        }

        public void setStartMonth(int startMonth) {
            this.startMonth = startMonth;
        }

        public int getStartDay() {
            return startDay;
        }

        public void setStartDay(int startDay) {
            this.startDay = startDay;
        }

        public int getStartHour() {
            return startHour;
        }

        public void setStartHour(int startHour) {
            this.startHour = startHour;
        }

        public int getStartMinute() {
            return startMinute;
        }

        public void setStartMinute(int startMinute) {
            this.startMinute = startMinute;
        }

        public int getEndYear() {
            return endYear;
        }

        public void setEndYear(int endYear) {
            this.endYear = endYear;
        }

        public int getEndMonth() {
            return endMonth;
        }

        public void setEndMonth(int endMonth) {
            this.endMonth = endMonth;
        }

        public int getEndDay() {
            return endDay;
        }

        public void setEndDay(int endDay) {
            this.endDay = endDay;
        }

        public int getEndHour() {
            return endHour;
        }

        public void setEndHour(int endHour) {
            this.endHour = endHour;
        }

        public int getEndMinute() {
            return endMinute;
        }

        public void setEndMinute(int endMinute) {
            this.endMinute = endMinute;
        }
    }
    class ActPicture{
        private int AcivityIndex;
        private String url;

        public int getActivityIndex() {
            return AcivityIndex;
        }

        public void setActivityIndex(int ActivityIndex) {
            this.AcivityIndex = ActivityIndex;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class ActReviewData {
        private int ivityIndex;
        private String id;
        private String review;
        @NonNull
        private String date;

        private float rating;

        public ActReviewData(String id, String review, String date, float rating) {
            this.id = id;
            this.review = review;
            this.date=date;
            this.rating = rating;
        }

        public String getDate(){
            return Manager.dateFromChanger(date);
        }

        public int getActivityIndex() {
            return ivityIndex;
        }

        public void setActivityIndex(int ivityIndex) {
            this.ivityIndex = ivityIndex;
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
            int ivityIndex;
            String hash;
        }
    } //o



    public ActData (String id,
                   String title,
                   String category,
                   String actLocation,
                   String actIntroduction,
                   String meetingPlace,
                   float price,
                   int maximumCapacity,
                   String addtionalInformation,
                   float lastReadyTime,
                   float actRating,
                   float totalTime)
    {
        this.id = id;
        this.title = title;
        this.category = category;
        this.actLocation = actLocation;
        this.actIntroduction = actIntroduction;
        this.meetingPlace = meetingPlace;
        this.price = price;
        this.maximumCapacity = maximumCapacity;
        this.addtionalInformation = addtionalInformation;
        this.lastReadyTime = lastReadyTime;
        this.actRating = actRating;
        this.totalTime = totalTime;
    }



    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTravelDestination() {
        return actLocation;
    }

    public void setTravelDestination(String actDestination) {
        this.actLocation = actDestination;
    }

    public String getTravelIntroduction() {
        return actIntroduction;
    }

    public void setTravelIntroduction(String actIntroduction) {
        this.actIntroduction = actIntroduction;
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public String getAddtionalInformation() {
        return addtionalInformation;
    }

    public void setAddtionalInformation(String addtionalInformation) {
        this.addtionalInformation = addtionalInformation;
    }

    public float getLastReadyTime() {
        return lastReadyTime;
    }

    public void setLastReadyTime(float lastReadyTime) {
        this.lastReadyTime = lastReadyTime;
    }

    public float getActivityRating() {
        return actRating;
    }

    public void setActivityRating(float ivityRating) {
        this.actRating = ivityRating;
    }

    public float getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(float totalTime) {
        this.totalTime = totalTime;
    }

    public void setId(String id) {
        this.id = id;
    }






}
