package com.meetmyteam.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "TEAMPOSITION")
@Getter @Setter
public class TeamPosition {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean staff;
    private int shirt;

    public TeamPosition() {
    }

    public TeamPosition(int shirt, String name, boolean staff) {
        this.name = name;
        this.staff = staff;
        this.shirt = shirt;
    }

}
