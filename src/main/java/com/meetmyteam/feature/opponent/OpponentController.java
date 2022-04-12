package com.meetmyteam.feature.opponent;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.meetmyteam.domain.Opponent;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OpponentController {

	private final OpponentService opponentService;
	Logger logger = LoggerFactory.getLogger(OpponentController.class);

	public OpponentController(OpponentService opponentService) {
		this.opponentService = opponentService;
	}

	@GetMapping("/opponent")
	public List<Opponent> getAllOpponents() {
		return opponentService.getAllOpponents();
	}

	@GetMapping("/opponent/{id}")
	public Opponent getOpponentById(@RequestParam Long id) {
		try {
			return opponentService.getOpponentById(id);
		} catch (Exception e) {
			logger.warn("{}{}", e.getMessage());
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@PostMapping("/opponent")
	public void postOpponent(@RequestBody Opponent opponent) {
		opponentService.postOpponent(opponent);
	}

	@PutMapping("/opponent/{id}")
	public void putOpponent(@RequestBody Opponent opponent, @PathVariable long id) {
		opponentService.putOpponent(opponent, id);
	}
	
	@DeleteMapping("/opponent/{id}")
	public void deleteOpponent(@PathVariable(required = true) long id) {	
		opponentService.deleteOpponent(id);
	}
	
	
}