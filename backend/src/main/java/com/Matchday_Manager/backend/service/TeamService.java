package com.Matchday_Manager.backend.service;

import com.Matchday_Manager.backend.models.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {
    public List<Team> getKnockoutTeams() {
        // Mocked data - replace with real data if available
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("France", "France"));
        teams.add(new Team("Germany", "Germany"));
        teams.add(new Team("Spain", "Spain"));
        teams.add(new Team("England", "England"));
        teams.add(new Team("Italy", "Italy"));
        teams.add(new Team("Netherlands", "Netherlands"));
        teams.add(new Team("Portugal", "Portugal"));
        teams.add(new Team("Belgium", "Belgium"));
        return teams;
    }
}
