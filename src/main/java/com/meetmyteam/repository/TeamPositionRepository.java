package com.meetmyteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meetmyteam.domain.TeamPosition;

@Repository
public interface TeamPositionRepository extends JpaRepository<TeamPosition, Long> {
}
