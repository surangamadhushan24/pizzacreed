package com.pizzaCreed.models;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Admin {
	
	@Id
	private String username;
	private String password;

}
