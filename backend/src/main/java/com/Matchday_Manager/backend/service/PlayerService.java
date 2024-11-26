package com.Matchday_Manager.backend.service;

import com.Matchday_Manager.backend.models.Player;
import com.Matchday_Manager.backend.utils.JsonFileReader;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final JsonFileReader jsonFileReader;
    private final List<Player> players;

    public PlayerService(JsonFileReader jsonFileReader) {
        this.jsonFileReader = jsonFileReader;
        this.players = jsonFileReader.readPlayersFromFile("players.json");
    }

    public List<Player> getPlayers() {
        return players;
    }

    public  Player getPlayerById(Integer id) {
        return players.stream()
                .filter(player -> player.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Player not found with id: " + id));
    }
}
