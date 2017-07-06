package com.sejin.campustown.data;

/**
 * Created by sejin on 2017. 7. 6..
 */

public class UserData {

    private String id;
    private String password;
    private String email;
    private String name;
    private String phone;
    // 체크해서 받는다.
    private String gender;
    private String birth;

    // 생성자 ㄴㄴ
    private String index;
    private String university,type;

    public UserData(String id, String password, String email, String name, String phone, String gender,String birth) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.birth=birth;
    }





    public String getBirth() {
        return birth;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBirth(String birth) {
        this.birth = birth;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }









}
