package com.meetmyteam.playermanager.feature.players;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetmyteam.playermanager.domain.Player;

public interface PlayerRepositary extends JpaRepository<Player, Long> {
}
