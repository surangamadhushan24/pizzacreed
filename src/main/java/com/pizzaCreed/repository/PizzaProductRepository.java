package com.pizzaCreed.repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzaCreed.models.PizzaProduct;

public interface PizzaProductRepository extends CrudRepository<PizzaProduct, Long> {

}
