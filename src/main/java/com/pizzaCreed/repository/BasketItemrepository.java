package com.pizzaCreed.repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzaCreed.models.BasketItem;

public interface BasketItemrepository extends CrudRepository<BasketItem, Long> {

}
