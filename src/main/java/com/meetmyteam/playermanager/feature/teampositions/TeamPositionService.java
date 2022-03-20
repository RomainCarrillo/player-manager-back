package com.meetmyteam.playermanager.feature.teampositions;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meetmyteam.playermanager.domain.TeamPosition;

@Service
public class TeamPositionService {

    @Autowired
    private final TeamPositionRepositary teamPositionRepositary;

    public TeamPositionService(TeamPositionRepositary teamPositionRepositary) {
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
