package com.pizzaCreed.web.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pizzaCreed.models.PizzaProduct;
import com.pizzaCreed.service.PizzaProductService;

@RestController
@RequestMapping(path = "api/products")
public class PizzaProductResources {
	
	@Autowired
	PizzaProductService service;
	
	@GetMapping
	public List<PizzaProduct> getAllProduct(){
		return service.getAllPizza();
	}
	

}
