package com.kabrasoft.utils;

import com.kabrasoft.models.Weakness;

import java.util.ArrayList;
import java.util.List;

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
}
