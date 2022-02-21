package com.meetmyteam.playermanager.feature.teampositions;

import com.meetmyteam.playermanager.domain.TeamPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
