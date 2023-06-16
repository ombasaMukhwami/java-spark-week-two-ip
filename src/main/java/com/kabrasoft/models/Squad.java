package com.kabrasoft.models;

public class Squad {
    private int id;
    private String name;
    private int maxSize;
    private int heroId;
    private Cause fight;
    public int getId() {
        return id;
    }
    public Squad() {

    }
    public Squad(int id, String name, int maxSize, int heroId, Cause fight) {
        this.id = id;
        this.name = name;
        this.maxSize = maxSize;
        this.heroId = heroId;
        this.fight = fight;
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

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public Cause getFight() {
        return fight;
    }

    public void setFight(Cause fight) {
        this.fight = fight;
    }



}
