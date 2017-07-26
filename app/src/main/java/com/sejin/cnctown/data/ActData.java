package com.sejin.cnctown.data;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by sejin on 2017. 7. 8..
 */

public class ActData {

    private String id, description, title, category, travelDestination, travelIntroduction, meetingPlacel;

    private float price;
    private int maximumCapacity;
    private String addtionalInformation;
    private float lastReadyTime;
    private float activityRating;
    private float totalHour;

    public ActData(String id,
                   String description,
                   String title,
                   String category,
                   String travelDestination,
                   String travelIntroduction,
                   String meetingPlacel,
                   float price,
                   int maximumCapacity,
                   String addtionalInformation,
                   float lastReadyTime,
                   float activityRating,
                   float totalHour) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.category = category;
        this.travelDestination = travelDestination;
        this.travelIntroduction = travelIntroduction;
        this.meetingPlacel = meetingPlacel;
        this.price = price;
        this.maximumCapacity = maximumCapacity;
        this.addtionalInformation = addtionalInformation;
        this.lastReadyTime = lastReadyTime;
        this.activityRating = activityRating;
        this.totalHour = totalHour;
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
        return travelDestination;
    }

    public void setTravelDestination(String travelDestination) {
        this.travelDestination = travelDestination;
    }

    public String getTravelIntroduction() {
        return travelIntroduction;
    }

    public void setTravelIntroduction(String travelIntroduction) {
        this.travelIntroduction = travelIntroduction;
    }

    public String getMeetingPlacel() {
        return meetingPlacel;
    }

    public void setMeetingPlacel(String meetingPlacel) {
        this.meetingPlacel = meetingPlacel;
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
        return activityRating;
    }

    public void setActivityRating(float activityRating) {
        this.activityRating = activityRating;
    }

    public float getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(float totalHour) {
        this.totalHour = totalHour;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    class ActivitySchedule {
        private int activityIndex;
        private String location;
        private int startYear, startMonth, startDay, startHour, startMinute, endYear, endMonth, endDay, endHour, endMinute;

        public int getActivityIndex() {
            return activityIndex;
        }

        public void setActivityIndex(int activityIndex) {
            this.activityIndex = activityIndex;
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

}
