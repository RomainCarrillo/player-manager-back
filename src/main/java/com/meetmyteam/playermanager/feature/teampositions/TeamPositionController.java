package com.meetmyteam.playermanager.feature.teampositions;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.meetmyteam.playermanager.domain.TeamPosition;
import com.meetmyteam.playermanager.ressources.Positions;

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

	@GetMapping("/posotions/{id}")
	public Optional<TeamPosition> getTeampPositionById(@PathVariable Long id) {
		try {
			return teamPositionService.getTeamPositionById(id);
		} catch (Exception e) {
			logger.warn("{}{}", e.getMessage());
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	// GESTION TEMPORAIRE DES POSTES
    private void setPostions() {
        for (TeamPosition p : Positions.getPositions()) {
            TeamPosition newPosition = new TeamPosition();
            newPosition = p;
            teamPositionService.save(newPosition);
        }
    }


}
