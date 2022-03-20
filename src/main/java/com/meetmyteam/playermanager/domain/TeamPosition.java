package com.meetmyteam.playermanager.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "TEAMPOSITION")
public class TeamPosition {

    @Id
    @GeneratedValue
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

    public Long getId() {
        return id;
    }

    public int getShirt() {
        return shirt;
    }

    public void setShirt(int shirt) {
        this.shirt = shirt;
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
