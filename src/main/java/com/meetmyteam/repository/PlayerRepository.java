package com.meetmyteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetmyteam.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
