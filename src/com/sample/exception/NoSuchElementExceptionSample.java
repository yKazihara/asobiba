package com.sample.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class NoSuchElementExceptionSample {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList();
            list.add("red");
            list.add("green");
            list.add("blue");

            Iterator it = list.iterator();
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());
            //red
            //green
            //blue
            //java.util.NoSuchElementException

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
