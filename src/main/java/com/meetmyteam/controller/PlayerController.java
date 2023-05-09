package com.meetmyteam.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.meetmyteam.domain.Player;
import com.meetmyteam.service.PlayerService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlayerController {

    private final PlayerService playerService;
    Logger logger = LoggerFactory.getLogger(PlayerController.class);

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getPlayerById(@PathVariable long id) {
        try {
            return playerService.getPlayerById(id);
        } catch (Exception e) {
            logger.warn("{}{}", e.getMessage());
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @PostMapping("/players")
    public void postPlayer(@RequestBody Player player) {
        playerService.postPlayer(player);
    }

    @PutMapping("/players/{id}")
    public void putPlayer(@RequestBody Player player, @PathVariable long id) {
        playerService.putPlayer(player, id);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable(required = true) long id) {
        playerService.deletePlayer(id);
    }

}