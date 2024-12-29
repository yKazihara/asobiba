package com.example;

import java.util.List;

public class StringJoinSample {
    public static void main(String[] args) {
        String str1 = String.join("-", "Apple", "Grape", "Melon");
        System.out.println(str1); // Apple-Grape-Melon

        List<String> strings = List.of("One", "Two", "Three");
        String str2 = String.join(" * ", strings);
        System.out.println(str2); // One * Two * Three
    }
}
