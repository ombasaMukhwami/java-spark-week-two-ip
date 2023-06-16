package com.kabrasoft;

import com.kabrasoft.models.Strength;
import com.kabrasoft.models.Weakness;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        List<Strength> strengthList = new ArrayList<>();
        strengthList.add(new Strength(1,"level 0", 50));
        strengthList.add(new Strength(2,"level 1", 60));
        strengthList.add(new Strength(3,"level 2", 70));
        strengthList.add(new Strength(4,"level 3", 80));
        strengthList.add(new Strength(5,"level 4", 90));
        strengthList.add(new Strength(6,"level 5", 100));

        System.out.println("Hello world!");
    }
}