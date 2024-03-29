package com.meetmyteam.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "OPPONENT")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Opponent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(AccessLevel.PROTECTED)
	private Long id;
	private String clubName;
	private String city;
	private String logoUrl;
	
}
