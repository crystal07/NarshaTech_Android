package com.sejin.cnctown.data;

import java.util.ArrayList;

/**
 * Created by sejin on 2017. 7. 11..
 */

public class DummyData {

    public static ActData.ActBasicData actBasicData =
            new ActData.ActBasicData(
                    "ghosejin",
                    "멋지고 까리한 세진이 집탐험",
                    "밀착탐구생활",
                    "왕십리역 6번출구",
                    4.99f,
                    334f,
                    "이 액티비티는 세진이의 집에 방문해 1박 2일간 세진이를 탐구하는 활동입니다",
                    "4명",
                    4,
                    2f,
                    2f,
                    2f,
                    "기념품: 세진이와 셀카",
                    "세진이 등에 태워줌",
                    "비밀...^^^"
                    );
    public static ActData.ActSchedule actSchedule = new ActData.ActSchedule(
            "세진이집",2017,8,3,9,0,2017,8,3,18,9,"url","저희집을 소개하자면..?"
    );


    public static ActData.ActLanguage actLanguage = new ActData.ActLanguage(new ArrayList<String>(){
        {
            add("한국어");
            add("영어");
            add("일본어");
        }
    });

    public static ActData.ActPicture actPicture = new ActData.ActPicture("main");


    public static ArrayList<ActData.ActReviewData> reviewDummyList = new ArrayList<ActData.ActReviewData>() {
        {
            add(new ActData.ActReviewData("이시영", "한번 더 방문하고 싶어요", "2017-08-02 11:11:11", 1f));
            add(new ActData.ActReviewData("id", "review", "2017-07-20 11:11:11", 2f));
            add(new ActData.ActReviewData("id", "review", "2017-07-20 11:11:11", 3f));
        }
    };


    public static ArrayList<ActData> actDummyList = new ArrayList<ActData>(){
        {
            add(new ActData(actBasicData, actLanguage, actSchedule, actPicture, reviewDummyList));
//            add(new ActData(actBasicData, actLanguage, actSchedule, actPicture, reviewDummyList));
//            add(new ActData(actBasicData, actLanguage, actSchedule, actPicture, reviewDummyList));
//            add(new ActData(actBasicData, actLanguage, actSchedule, actPicture, reviewDummyList));
        }
    };

    public static ActData actDummyData= new ActData(actBasicData,actLanguage,actSchedule,actPicture,reviewDummyList);


}
