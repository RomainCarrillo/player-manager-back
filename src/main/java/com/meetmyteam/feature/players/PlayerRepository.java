package com.meetmyteam.feature.players;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetmyteam.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
