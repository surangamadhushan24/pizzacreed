package com.pizzaCreed.web.resources;




import com.pizzaCreed.models.*;
import com.pizzaCreed.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/shopping-basket")
public class  ShoppingBasketResources {

	

	@Autowired
	private ShoppingBasketService shoppingBasketService;

	@Autowired
	private BasketItemService basketItemService;



	
	@PostMapping("/basket")
	public ShoppingBasket createShoppingBasket() {
		return shoppingBasketService.createShoppingBasket();
	}

	@PostMapping("/basket/{basketId}/items")
	public ShoppingBasket addProductToBasket(@PathVariable Long basketId, @RequestBody BasketItem basketItem) {
		ShoppingBasket basket = shoppingBasketService.getShoppingBasket(basketId);
		if (basket == null) {
			throw new IllegalArgumentException("Invalid ShoppingBasket ID");
		}

		basketItem.setBasket(basket);
		basketItemService.save(basketItem);

		basket.getItems().add(basketItem);
		return shoppingBasketService.save(basket);
	}

	
	@DeleteMapping("/basket/{basketId}/items/{itemId}")
	public ShoppingBasket removeProductFromBasket(@PathVariable Long basketId, @PathVariable Long itemId) {
	  
	    ShoppingBasket basket = shoppingBasketService.getShoppingBasket(basketId);

	  
	    if (basket == null) {
	        throw new IllegalArgumentException("Invalid ShoppingBasket ID");
	    }

	   
	    BasketItem itemToRemove = null;

	 
	    for (BasketItem item : basket.getItems()) {
	        if (item.getBId().equals(itemId)) {
	            itemToRemove = item;
	            break;
	        }
	    }

	    
	    if (itemToRemove != null) {
	        basket.getItems().remove(itemToRemove);
	        basketItemService.delete(itemToRemove);
	    }

	  
	    return shoppingBasketService.save(basket);
	}


	
	@GetMapping("/basket/{basketId}")
	public ShoppingBasket viewShoppingBasket(@PathVariable Long basketId) {
		return shoppingBasketService.getShoppingBasket(basketId);
	}

	
	@PostMapping("/basket/{basketId}/checkout")
	public void checkout(@PathVariable Long basketId) {
		ShoppingBasket basket = shoppingBasketService.getShoppingBasket(basketId);
		if (basket == null) {
			throw new IllegalArgumentException("Invalid ShoppingBasket ID");
		}
		
		shoppingBasketService.delete(basket);
	}
}
