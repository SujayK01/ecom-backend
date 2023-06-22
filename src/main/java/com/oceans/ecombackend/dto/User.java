package com.oceans.ecombackend.dto;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name, password;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false, unique = true)
	private long phone;
	@OneToMany
	private ArrayList<Product> wishList;
	@OneToMany
	private ArrayList<Product> kart;
	@OneToMany
	private ArrayList<Address> addresses;
	@OneToMany
	private ArrayList<Card> cards;
}
