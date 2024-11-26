package com.Matchday_Manager.backend.models;

public class Team {
    private Integer id;
    private String name;

    // Constructors
    public Team() {}

    public Team(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters

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

}
