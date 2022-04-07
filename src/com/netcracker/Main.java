package com.netcracker;

import com.netcracker.generics.Gen;
import com.netcracker.generics.Stats;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Stats<Integer> integerStats = new Stats<>(new Integer[]{1,2,3,4,5});
        Stats<Float> floatStats = new Stats<>(new Float[]{1.2f,2.4f,3.5f,5.6f});

        System.out.println(integerStats.calculateAvg());
        System.out.println(floatStats.calculateAvg());
    }
}
