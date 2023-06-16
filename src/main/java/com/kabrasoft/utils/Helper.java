package com.kabrasoft.utils;

import com.kabrasoft.models.Cause;
import com.kabrasoft.models.Squad;
import com.kabrasoft.models.Strength;
import com.kabrasoft.models.Weakness;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public final class Helper {
    private Helper() {

    }

    public  static List<Weakness> getWeakness(){
        List<Weakness> weaknessList = new ArrayList<>();
        weaknessList.add(new Weakness(1,"level 0", 0));
        weaknessList.add(new Weakness(2,"level 1", 10));
        weaknessList.add(new Weakness(3,"level 2", 20));
        weaknessList.add(new Weakness(4,"level 3", 30));
        weaknessList.add(new Weakness(5,"level 4", 40));
        return weaknessList;
    }

    public static List<Strength> getStrength(){
        List<Strength> strengthList = new ArrayList<>();
        strengthList.add(new Strength(1,"level 0", 50));
        strengthList.add(new Strength(2,"level 1", 60));
        strengthList.add(new Strength(3,"level 2", 70));
        strengthList.add(new Strength(4,"level 3", 80));
        strengthList.add(new Strength(5,"level 4", 90));
        strengthList.add(new Strength(6,"level 5", 100));
        return strengthList;
    }

    public static List<Squad> sampleSquad() {
        List<Squad> squadList = new ArrayList<>();
        squadList.add(new Squad(1,"Kenya",7,1, Cause.SEXISM));
        squadList.add(new Squad(1,"Uganda",7,1, Cause.COMPUTER_ILLITERACY));
        squadList.add(new Squad(1,"Tanzania",7,1, Cause.HOGGING_BUS_SEATS_WITH_BACKPACK));
        squadList.add(new Squad(1,"Niger",7,1, Cause.PASSIVE_AGGRESSIVE_POST_IT_NOTES));
        squadList.add(new Squad(1,"Nigeria",7,1, Cause.SEXISM));
        squadList.add(new Squad(1,"Cameroon",7,1, Cause.NOT_COVERING_MOUTH_WHEN_SNEEZE));

        return squadList;
    }
}
