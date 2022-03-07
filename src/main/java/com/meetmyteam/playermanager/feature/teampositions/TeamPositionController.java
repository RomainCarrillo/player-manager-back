package com.meetmyteam.playermanager.feature.teampositions;

import com.meetmyteam.playermanager.domain.TeamPosition;
import com.meetmyteam.playermanager.ressources.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TeamPositionController {

    private final TeamPositionService teamPositionService;
    Logger logger = LoggerFactory.getLogger(TeamPositionController.class);


    public TeamPositionController(TeamPositionService teamPositionService) {
        this.teamPositionService = teamPositionService;
    }


    @GetMapping("/positions")
    public List<TeamPosition> getAllPositions() {
        setPostions();
        return teamPositionService.getAll();
    }


    private void setPostions() {
        for (TeamPosition p : Positions.getPositions()) {
            TeamPosition newPosition = new TeamPosition();
            newPosition = p;
            teamPositionService.save(newPosition);
        }
    }


}
