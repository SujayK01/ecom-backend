package com.oceans.ecombackend.dto;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name, brand, category, description;
	@Column(nullable = false)
	private double price;
	private int rating;
	private int noOfProducts;
	@ManyToMany(cascade = CascadeType.ALL)
	private ArrayList<MyOrder> orders;

}
