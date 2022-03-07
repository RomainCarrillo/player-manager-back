package com.meetmyteam.playermanager.feature.players;

import com.meetmyteam.playermanager.domain.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

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
        return playerService.getList();
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