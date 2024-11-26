package com.Matchday_Manager.backend.utils;

import com.Matchday_Manager.backend.models.Player;
import com.Matchday_Manager.backend.models.Team;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class JsonFileReader {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Team> readTeamsFromFile(String fileName) {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new RuntimeException("File not found: " + fileName);
            }
            return objectMapper.readValue(inputStream, new TypeReference<List<Team>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + fileName, e);
        }
    }
    public List<Player> readPlayersFromFile(String fileName) {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new RuntimeException("File not found: " + fileName);
            }
            return objectMapper.readValue(inputStream, new TypeReference<List<Player>>() {});
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + fileName, e);
        }
    }
}
