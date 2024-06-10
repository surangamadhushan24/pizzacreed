package com.pizzaCreed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzaCreed.models.BasketItem;
import com.pizzaCreed.repository.BasketItemrepository;

@Service
public class BasketItemService {


    @Autowired
    private BasketItemrepository basketItemRepository;

    public BasketItem save(BasketItem basketItem) {
        return basketItemRepository.save(basketItem);
    }
    
    public void delete(BasketItem basketItem) {
        basketItemRepository.delete(basketItem);
    }
}
