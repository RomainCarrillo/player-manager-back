package com.meetmyteam.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "PLAYER")
@Getter @Setter
public class Player {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.PROTECTED)
    private Long id;
    private String firstName;
    private String lastName;
	private LocalDate birthDate;
    private String photoUrl;

    public Player() {
    }

	public Player(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

	public Player(String firstName, String lastName, LocalDate birthDate, String photoUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.photoUrl = photoUrl;
	}

	public Player(Long id, String firstName, String lastName, LocalDate birthDate, String photoUrl) {
        	this.id = id;
        	this.firstName = firstName;
        	this.lastName = lastName;
        	this.birthDate = birthDate;
        	this.photoUrl = photoUrl;
    }

}