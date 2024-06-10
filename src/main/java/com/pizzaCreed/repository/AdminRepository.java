package com.pizzaCreed.repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzaCreed.models.Admin;

public interface AdminRepository extends CrudRepository<Admin,String> {
    Admin findByUsername(String username);
}
