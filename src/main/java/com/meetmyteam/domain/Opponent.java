package com.meetmyteam.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "OPPONENT")
@Getter @Setter @NoArgsConstructor
public class Opponent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(AccessLevel.PROTECTED)
	private String id;
	private String clubName;
	private String city;
	private String logoUrl;
	
	public Opponent(String clubName, String city, String logoUrl) {
		this.clubName = clubName;
		this.city = city;
		this.logoUrl = logoUrl;
	}
	
	
}
