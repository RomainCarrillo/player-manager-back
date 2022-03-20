package com.meetmyteam.playermanager.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "PLAYER")
public class Player {
    @Id
    @GeneratedValue
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

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	public LocalDate getBirthDate() {
        return birthDate;
    }

	public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
