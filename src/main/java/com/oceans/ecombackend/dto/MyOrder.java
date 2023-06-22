package com.oceans.ecombackend.dto;

import java.time.LocalDate;
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
@Getter
@Setter
public class MyOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate date;
	private LocalDate deliveryDate;
	@Column(nullable = false)
	private double price;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "orders")
	private ArrayList<Product> products;
}
