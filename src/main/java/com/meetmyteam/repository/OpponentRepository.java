package com.meetmyteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meetmyteam.domain.Opponent;

@Repository
public interface OpponentRepository extends JpaRepository<Opponent, Long> {}
