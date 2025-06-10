package com.sample.exception;

import java.util.HashMap;
import java.util.Date;

public class ClassCastExceptionSample {
    public static void main(String[] args) {
        try {
            HashMap map = new HashMap();
            map.put("xmas", "2005/12/25");

            Date date = (Date)map.get("xmas");
            System.out.println(date);

        } catch (Exception e) {
            e.printStackTrace();
            // java.lang.ClassCastException: class java.lang.String cannot be cast to class
            // java.util.Date (java.lang.String and java.util.Date are in module java.base of loader 'bootstrap')
        }
    }
}
