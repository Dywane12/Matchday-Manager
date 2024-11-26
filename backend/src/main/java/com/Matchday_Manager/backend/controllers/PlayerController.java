package com.Matchday_Manager.backend.controllers;

import com.Matchday_Manager.backend.models.Player;
import com.Matchday_Manager.backend.models.Team;
import com.Matchday_Manager.backend.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@CrossOrigin(origins = "http://localhost:5173")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Integer id) {
        Player player = playerService.getPlayerById(id);
        return ResponseEntity.ok(player);
    }
}
