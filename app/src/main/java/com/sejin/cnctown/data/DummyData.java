package com.sejin.cnctown.data;

import java.util.ArrayList;

/**
 * Created by sejin on 2017. 7. 11..
 */

public class DummyData {

    public static ArrayList<ReviewData> reviewDummyList= new ArrayList<ReviewData>(){
        {
            add (new ReviewData("id","review","2017-07-20 11:11:11",1f));
            add (new ReviewData("id","review","2017-07-20 11:11:11",2f));
            add (new ReviewData("id","review","2017-07-20 11:11:11",3f));
        }


    };

    public static ArrayList<ActData> tripDummyList= new ArrayList<ActData>(){
        {
            add(new ActData("행당산 등반","학학 너무너무 힘들다 ㅠㅠ"));
            add(new ActData("Creative lab 0","smell terrible "));
            add(new ActData("Xeno Internet cafe"," do you wanna play overwatch?"));
            add(new ActData("encore karaoke"," 서비스 엄청 많이 줍니다 "));
            add(new ActData("허헛 히힛 호호호 이름지을게 없어! ","가나다라마바사아자차카타파하 아이에오우 카키쿠케코 사시스세소 "));
            add(new ActData("허헛 히힛 호호호 이름지을게 없어! ","가나다라마바사아자차카타파하 아이에오우 카키쿠케코 사시스세소 "));
            add(new ActData("세진이집","멋지고 착한 사람이 살고 있어요"));
        }
    };

}
