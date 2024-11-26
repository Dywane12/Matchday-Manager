package com.Matchday_Manager.backend.service;

import com.Matchday_Manager.backend.models.Team;
import com.Matchday_Manager.backend.utils.JsonFileReader;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    private final JsonFileReader jsonFileReader;
    private final List<Team> teams;

    public TeamService(JsonFileReader jsonFileReader) {
        this.jsonFileReader = jsonFileReader;
        this.teams = jsonFileReader.readTeamsFromFile("teams.json");
    }

    public List<Team> getKnockoutTeams() {
        return teams;
    }

    public Team getTeamById(Integer id) {
        return teams.stream()
                .filter(team -> team.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Team not found with id: " + id));
    }
}
