package com.sejin.cnctown.data;

import com.sejin.cnctown.R;

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sejin on 2017. 7. 27..
 */

public class Manager {

    public static final int MY_PER_RC1 = 1001;
    public static final int MY_PER_RC2 = 1002;
    public static final int MY_PER_RC3 = 1003;
    public static final int RC_PLACE_PICKER= 1001;
    public static String dateFromChanger(String date) {

        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat outputFormat = new SimpleDateFormat("yyyy. dd. MM");
        Date resDate = null;
        try {
            String inputDateStr = date;
            resDate = inputFormat.parse(inputDateStr);
            String outputDateStr = outputFormat.format(resDate);
            return outputDateStr;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int getDrawableResId(String resName)  {
        try {
            Field idField = R.drawable.class.getDeclaredField(resName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}

