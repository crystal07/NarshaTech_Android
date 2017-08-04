package com.sejin.cnctown.data;

import android.support.annotation.NonNull;

import java.util.ArrayList;

/**
 * Created by sejin on 2017. 7. 8..
 */

public class ActData {


    public ActBasicData getActBasicData() {
        return actBasicData;
    }

    public void setActBasicData(ActBasicData actBasicData) {
        this.actBasicData = actBasicData;
    }

    public ActLanguage getActLanguage() {
        return actLanguage;
    }

    public void setActLanguage(ActLanguage actLanguage) {
        this.actLanguage = actLanguage;
    }

    public ActSchedule getActSchedule() {
        return actSchedule;
    }

    public void setActSchedule(ActSchedule actSchedule) {
        this.actSchedule = actSchedule;
    }

    public ActPicture getActPicture() {
        return actPicture;
    }

    public void setActPicture(ActPicture actPicture) {
        this.actPicture = actPicture;
    }

    public ArrayList<ActReviewData> getActReviewList() {
        return actReviewList;
    }

    public void setActReviewList(ArrayList<ActReviewData> actReviewList) {
        this.actReviewList = actReviewList;
    }

    public static class ActBasicData {

        private String id;
        private String title,
                category, //ㅇ
                actLocation;//ㅇ 활동 장소
        private ActLanguage actLanguage;
        private float actRating; //ㅇ
        private float price; //o
        private String actIntroduction; //o
        private String meetingPlace; // 집합장소
        private int maximumCapacity; //ㅇ
        private float totalTime;//ㅇ
        private float readyTime;
        private float lastReadyTime;
        private String offerItem;
        private String vehicle;
        private String addtionalInformation;
        private ActSchedule actSchedule;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public String getActLocation() {
            return actLocation;
        }

        public void setActLocation(String actLocation) {
            this.actLocation = actLocation;
        }

        public ActLanguage getActLanguage() {
            return actLanguage;
        }

        public void setActLanguage(ActLanguage actLanguage) {
            this.actLanguage = actLanguage;
        }

        public float getActRating() {
            return actRating;
        }

        public void setActRating(float actRating) {
            this.actRating = actRating;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getActIntroduction() {
            return actIntroduction;
        }

        public void setActIntroduction(String actIntroduction) {
            this.actIntroduction = actIntroduction;
        }

        public String getMeetingPlace() {
            return meetingPlace;
        }

        public void setMeetingPlace(String meetingPlace) {
            this.meetingPlace = meetingPlace;
        }

        public int getMaximumCapacity() {
            return maximumCapacity;
        }

        public void setMaximumCapacity(int maximumCapacity) {
            this.maximumCapacity = maximumCapacity;
        }

        public float getTotalTime() {
            return totalTime;
        }

        public void setTotalTime(float totalTime) {
            this.totalTime = totalTime;
        }

        public float getReadyTime() {
            return readyTime;
        }

        public void setReadyTime(float readyTime) {
            this.readyTime = readyTime;
        }

        public float getLastReadyTime() {
            return lastReadyTime;
        }

        public void setLastReadyTime(float lastReadyTime) {
            this.lastReadyTime = lastReadyTime;
        }

        public String getOfferItem() {
            return offerItem;
        }

        public void setOfferItem(String offerItem) {
            this.offerItem = offerItem;
        }

        public String getVehicle() {
            return vehicle;
        }

        public void setVehicle(String vehicle) {
            this.vehicle = vehicle;
        }

        public String getAddtionalInformation() {
            return addtionalInformation;
        }

        public void setAddtionalInformation(String addtionalInformation) {
            this.addtionalInformation = addtionalInformation;
        }

        public ActSchedule getActSchedule() {
            return actSchedule;
        }

        public void setActSchedule(ActSchedule actSchedule) {
            this.actSchedule = actSchedule;
        }

        public ActBasicData(String id, String title, String category, String actLocation, float actRating, float price, String actIntroduction, String meetingPlace, int maximumCapacity, float totalTime, float readyTime, float lastReadyTime, String offerItem, String vehicle, String addtionalInformation) {
            this.id = id;
            this.title = title;

            this.category = category;
            this.actLocation = actLocation;
            this.actRating = actRating;
            this.price = price;
            this.actIntroduction = actIntroduction;
            this.meetingPlace = meetingPlace;
            this.maximumCapacity = maximumCapacity;
            this.totalTime = totalTime;
            this.readyTime = readyTime;
            this.lastReadyTime = lastReadyTime;
            this.offerItem = offerItem;
            this.vehicle = vehicle;
            this.addtionalInformation = addtionalInformation;
        }


    }

    static class ActLanguage {
        int activityIndex;

        public int getActivityIndex() {
            return activityIndex;
        }

        public void setActivityIndex(int activityIndex) {
            this.activityIndex = activityIndex;
        }

        public ArrayList<String> getLangList() {
            return langList;
        }

        public void setLangList(ArrayList<String> langList) {
            this.langList = langList;
        }

        ArrayList<String> langList;

        ActLanguage(ArrayList langList) {
            this.langList = langList;
        }
    }

    static class ActSchedule {

        private int ActivityIndex;
        private String location;
        private int startYear, startMonth, startDay, startHour, startMinute, endYear, endMonth, endDay, endHour, endMinute;
        private String url;
        private String introduction;


        public ActSchedule(String location, int startYear, int startMonth, int startDay, int startHour, int startMinute, int endYear, int endMonth, int endDay, int endHour, int endMinute, String url, String introduction) {
            this.location = location;
            this.startYear = startYear;
            this.startMonth = startMonth;
            this.startDay = startDay;
            this.startHour = startHour;
            this.startMinute = startMinute;
            this.endYear = endYear;
            this.endMonth = endMonth;
            this.endDay = endDay;
            this.endHour = endHour;
            this.endMinute = endMinute;
            this.url = url;
            this.introduction = introduction;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }


        public int getActivityIndex() {
            return ActivityIndex;
        }

        public void setActivityIndex(int ActivityIndex) {
            this.ActivityIndex = ActivityIndex;
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

    static class ActPicture {

        public ActPicture(String url) {
            this.url = url;
        }

        private int ActivityIndex;
        private String url;

        public int getActivityIndex() {
            return ActivityIndex;
        }

        public void setActivityIndex(int ActivityIndex) {
            this.ActivityIndex = ActivityIndex;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class ActReviewData {
        private int ActivityIndex;
        private String id;
        private String review;
        @NonNull
        private String date;

        private float rating;

        public ActReviewData(String id, String review, String date, float rating) {
            this.id = id;
            this.review = review;
            this.date = date;
            this.rating = rating;
        }

        public String getDate() {
            return Manager.dateFromChanger(date);
        }

        public int getActivityIndex() {
            return ActivityIndex;
        }

        public void setActivityIndex(int ActivityIndex) {
            this.ActivityIndex = ActivityIndex;
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


        class HashTag {
            int activityIndex;
            String hash;
        }
    }

    private ActBasicData actBasicData;
    private ActLanguage actLanguage;
    private ActSchedule actSchedule;
    private ActPicture actPicture;
    private ArrayList<ActReviewData> actReviewList;


    public ActData(ActBasicData actBasicData, ActLanguage actLanguage, ActSchedule actSchedule, ActPicture actPicture, ArrayList<ActReviewData> actReviewList) {
        this.actBasicData = actBasicData;
        this.actLanguage = actLanguage;
        this.actSchedule = actSchedule;
        this.actPicture = actPicture;
        this.actReviewList = actReviewList;
    }
}
