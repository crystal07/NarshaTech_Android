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


}
