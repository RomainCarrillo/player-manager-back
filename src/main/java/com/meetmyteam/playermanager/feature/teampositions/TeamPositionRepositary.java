package com.meetmyteam.playermanager.feature.teampositions;

import com.meetmyteam.playermanager.domain.TeamPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamPositionRepositary extends JpaRepository<TeamPosition, Long> {
}
