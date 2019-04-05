package com.cskaoyan.convertor;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Wang Xueyang
 * @create 2019-04-05
 */

/**
 * String型 转 Date型
 */
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
