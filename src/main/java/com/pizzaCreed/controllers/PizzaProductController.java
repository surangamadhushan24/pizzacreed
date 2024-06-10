package com.pizzaCreed.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pizzaCreed.models.PizzaProduct;
import com.pizzaCreed.service.PizzaProductService;

@Controller
public class PizzaProductController {

	@Autowired
	PizzaProductService service;

	@GetMapping("/admin/products")
	public String listProducts(Model model) {
		List<PizzaProduct> list = service.getAllPizza();
		model.addAttribute("products", list);
		return "home";
	}
	
	@RequestMapping("/admin/deletePizza")
	public String deleteForm(Model model) {
	    PizzaProduct product = new PizzaProduct();
	    model.addAttribute("product", product);
	    return "delete_form";
	}
	
	@RequestMapping("/admin/editPizza")
	public String editForm(Model model) {
	    PizzaProduct product = new PizzaProduct();
	    model.addAttribute("product", product);
	    return "edit_form";
	}
	
	@RequestMapping("/admin/new")
	public String newProductForm(Model model) {
	    PizzaProduct product = new PizzaProduct();
	    model.addAttribute("product", product);
	    return "new_product";
	}
	
	@RequestMapping(value = "/admin/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("product") PizzaProduct product) {
	    service.addPizza(product);
	    return "redirect:/admin/products";
	}
	
	@RequestMapping("admin/edit")
	public ModelAndView editProductForm(@RequestParam long pid) {
	    ModelAndView mav = new ModelAndView("edit_product");
	    PizzaProduct product = service.getPizzaId(pid);
	    mav.addObject("product", product);
	 
	    return mav;
	}
	
	@RequestMapping("admin/delete")
	public String deleteProduct(@RequestParam long pid) {
	    service.deletePizza(pid);
	    return "redirect:/admin/products";       
	}

}
