package com.sejin.cnctown.data;

/**
 * Created by sejin on 2017. 7. 26..
 */

public class HostData {
    private String id,university,location,introducing;
    private String totalRationg;
    private String universityIntroduction;


    public HostData(String id, String university, String location, String introducing, String totalRationg, String universityIntroduction) {

        this.id = id;
        this.university = university;
        this.location = location;
        this.introducing = introducing;
        this.totalRationg = totalRationg;
        this.universityIntroduction = universityIntroduction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIntroducing() {
        return introducing;
    }

    public void setIntroducing(String introducing) {
        this.introducing = introducing;
    }

    public String getTotalRationg() {
        return totalRationg;
    }

    public void setTotalRationg(String totalRationg) {
        this.totalRationg = totalRationg;
    }

    public String getUniversityIntroduction() {
        return universityIntroduction;
    }

    public void setUniversityIntroduction(String universityIntroduction) {
        this.universityIntroduction = universityIntroduction;
    }


}
