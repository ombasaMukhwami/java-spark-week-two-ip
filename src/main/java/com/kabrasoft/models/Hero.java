package com.kabrasoft.models;

public class Hero {
    private int id;
    private String name;
    private int age;
    private int strengthId;
    private int weaknessId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrengthId() {
        return strengthId;
    }

    public void setStrengthId(int strengthId) {
        this.strengthId = strengthId;
    }

    public int getWeaknessId() {
        return weaknessId;
    }

    public void setWeaknessId(int weaknessId) {
        this.weaknessId = weaknessId;
    }


}
