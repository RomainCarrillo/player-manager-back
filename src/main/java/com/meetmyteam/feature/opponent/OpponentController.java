package com.meetmyteam.feature.opponent;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Opponent> getAllOpponents(){
    	return opponentService.getAllOpponents();
    }
}
