package com.cskaoyan.util;

/**
 * Created by Fancy on 2019/4/5
 */

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parseDate = null;
        try {
            parseDate = dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;
    }
}