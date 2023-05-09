package com.meetmyteam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meetmyteam.domain.TeamPosition;
import com.meetmyteam.repository.TeamPositionRepository;

@Service
public class TeamPositionService {

    @Autowired
    private final TeamPositionRepository teamPositionRepositary;

    public TeamPositionService(TeamPositionRepository teamPositionRepositary) {
        this.teamPositionRepositary = teamPositionRepositary;
    }

    public void save(TeamPosition newPosition) {
        this.teamPositionRepositary.save(newPosition);
    }


    public List<TeamPosition> getAll() {
        return teamPositionRepositary.findAll();
    }

	public Optional<TeamPosition> getTeamPositionById(Long id) {
		return teamPositionRepositary.findById(id);
	}
}
