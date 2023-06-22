package com.oceans.ecombackend.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int homeNo;
	private int floorNo;
	private String buildingName, landmark, area, city, state;
	@Column(nullable = false)
	private int pincode;
}
