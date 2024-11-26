package com.Matchday_Manager.backend.models;

public class Player {
    private Integer id;
    private String name;
    private String position;
    private Integer defence;
    private Integer passing;
    private Integer shooting;

    public Player() {}

    public Player(Integer id, String name, String position, Integer defence, Integer passing, Integer shooting) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.defence = defence;
        this.passing = passing;
        this.shooting = shooting;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getPassing() {
        return passing;
    }

    public void setPassing(Integer passing) {
        this.passing = passing;
    }

    public Integer getShooting() {
        return shooting;
    }

    public void setShooting(Integer shooting) {
        this.shooting = shooting;
    }
}
