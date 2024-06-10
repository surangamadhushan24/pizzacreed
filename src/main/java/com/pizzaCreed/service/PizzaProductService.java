package com.pizzaCreed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzaCreed.models.PizzaProduct;
import com.pizzaCreed.repository.PizzaProductRepository;


import jakarta.transaction.Transactional;

@Service
public class PizzaProductService {
	
	@Autowired
	PizzaProductRepository pizzaProductRepository;
	
	@Transactional
	public List<PizzaProduct> getAllPizza() {
		return (List<PizzaProduct>) pizzaProductRepository.findAll();
		
	}
	
	@Transactional
	public void deletePizza(Long id) {
		pizzaProductRepository.deleteById(id);
	}
	
	@Transactional
	public boolean addPizza(PizzaProduct pizza) {
		return pizzaProductRepository.save(pizza) != null;
	}
	
	@Transactional
	public PizzaProduct getPizzaId(Long id) {
		return pizzaProductRepository.findById(id).get() ;
		
	}
	

}
