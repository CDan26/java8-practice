package com.cocosd.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda1 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("dan", "daniel", "dana", "danut");

        Collections.sort(names, (a, b) -> b.compareTo(a));

        System.out.println(names);
    }
}
