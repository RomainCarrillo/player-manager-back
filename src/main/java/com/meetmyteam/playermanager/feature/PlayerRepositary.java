package com.meetmyteam.playermanager.feature;

import com.meetmyteam.playermanager.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepositary extends JpaRepository<Player, Long> {
}
