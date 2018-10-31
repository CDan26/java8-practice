package com.cocosd.stream;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {

    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("str1");
        stringCollection.add("str2");
        stringCollection.add("str3");
        stringCollection.add("str4");

        stringCollection.stream()
                .filter(str -> str.endsWith("3") || str.endsWith("4"))
                .forEach(System.out::println);
    }
}
