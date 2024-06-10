package com.pizzaCreed.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.pizzaCreed.models.BasketItem;
import com.pizzaCreed.models.PizzaProduct;
import com.pizzaCreed.models.ShoppingBasket;
import com.pizzaCreed.repository.BasketItemrepository;
import com.pizzaCreed.repository.PizzaProductRepository;
import com.pizzaCreed.repository.ShoppingBasketRepository;

@Service
public class ShoppingBasketService {

	@Autowired
	private ShoppingBasketRepository shoppingBasketRepository;

	@Autowired
	private BasketItemrepository basketItemrepository;

	@Autowired
	private PizzaProductRepository pizzaProductRepository;

	@Transactional
	public ShoppingBasket createShoppingBasket() {
		ShoppingBasket shoppingBasket = new ShoppingBasket();

		return shoppingBasketRepository.save(shoppingBasket);
	}

	@Transactional
	public ShoppingBasket getShoppingBasket(Long id) {
		return shoppingBasketRepository.findById(id).orElse(null);
	}

	@Transactional
    public ShoppingBasket save(ShoppingBasket basket) {
        return shoppingBasketRepository.save(basket);
    }

	
	@Transactional
	public void delete(ShoppingBasket basket) {
		shoppingBasketRepository.delete(basket);
	}

}
