package com.meetmyteam.playermanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "TEAMPOSITION")
public class TeamPosition {

    @Id
    @GeneratedValue
    private Long id;
    private int number;
    private String name;
    private boolean staff;

    public TeamPosition() {
    }

    public TeamPosition(int number, String name, boolean staff) {
        this.number = number;
        this.name = name;
        this.staff = staff;
    }

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStaff() {
        return staff;
    }

    public void setStaff(boolean staff) {
        this.staff = staff;
    }
}
