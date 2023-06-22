package com.oceans.ecombackend.dto;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true)
	private String type;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false, unique = true)
	private long number;
	@Column(nullable = false)
	private LocalDate expDate;
	@ManyToOne
	private User user;
}
