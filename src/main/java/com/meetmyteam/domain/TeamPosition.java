package com.meetmyteam.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TEAMPOSITION")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamPosition {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean staff;
    private int shirt;
}
