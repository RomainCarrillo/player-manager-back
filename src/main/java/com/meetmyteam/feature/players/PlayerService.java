package com.meetmyteam.feature.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meetmyteam.domain.Player;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    public PlayerRepository playerRepositary;

    public Player getPlayerById(Long id) throws Exception {
        return playerRepositary.findById(id).orElseThrow(Exception::new);
    }

    public List<Player> getList() {
        return playerRepositary.findAll();
    }

    public void postPlayer(Player player) {
        playerRepositary.save(player);
    }

    public void putPlayer(Player player, long id) {
        Optional<Player> playerOptional = playerRepositary.findById(id);
        if (playerOptional.isPresent()) {
            Player modifiedPlayer = playerRepositary.getById(id);
            modifiedPlayer.setFirstName(player.getFirstName());
            modifiedPlayer.setLastName(player.getLastName());
            modifiedPlayer.setBirthDate(player.getBirthDate());
            modifiedPlayer.setPhotoUrl(player.getPhotoUrl());
            playerRepositary.save(modifiedPlayer);
        }
    }

    public void deletePlayer(long id) {
        Optional<Player> playerOptional = playerRepositary.findById(id);
        if (playerOptional.isPresent()) {
            playerRepositary.deleteById(id);
        }
    }
}
