package com.meetmyteam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meetmyteam.domain.Opponent;
import com.meetmyteam.repository.OpponentRepository;


@Service
public class OpponentService {

	@Autowired
	public OpponentRepository opponentRepository;
	
	public List<Opponent> getAllOpponents(){
		return opponentRepository.findAll();
	}
	
	public Opponent getOpponentById(long id) throws Exception{
		return opponentRepository.findById(id).orElseThrow(Exception::new);
	}
	
	public void postOpponent(Opponent opponent) {
		opponentRepository.save(opponent);
	}
	
	public void putOpponent(Opponent opponent, long id) {
		Optional<Opponent> oppenenOptional = opponentRepository.findById(id);
		if(oppenenOptional.isPresent()) {
			Opponent modifiedOpponent = opponentRepository.getById(id);
			modifiedOpponent.setClubName(opponent.getClubName());
			modifiedOpponent.setCity(opponent.getCity());
			modifiedOpponent.setLogoUrl(opponent.getLogoUrl());
			opponentRepository.save(modifiedOpponent);
		}
	}
	
	public void deleteOpponent(long id) {
		Optional<Opponent> opponentOptional = opponentRepository.findById(id);
		if(opponentOptional.isPresent()) {
			opponentRepository.deleteById(id);
			
		}
	}
	
}
