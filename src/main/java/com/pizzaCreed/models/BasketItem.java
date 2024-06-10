package com.pizzaCreed.models;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class BasketItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long bId;
	private Double amount;
	@ManyToOne 
	@JoinColumn(name = "p_id", nullable = false)
	private PizzaProduct pizzaProduct;
	@ManyToOne 
	@JoinColumn(name = "sb_Id", nullable = false)
	@JsonBackReference
	private ShoppingBasket basket;
	
	
	
}
