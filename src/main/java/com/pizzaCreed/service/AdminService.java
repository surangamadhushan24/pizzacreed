package com.pizzaCreed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzaCreed.models.Admin;
import com.pizzaCreed.repository.AdminRepository;

@Service
public class AdminService {
	

    @Autowired
    private AdminRepository adminRepository;

    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    public boolean validateAdmin(String username, String password) {
        Admin admin = findByUsername(username);
        return admin != null && admin.getPassword().equals(password);
    }

}
