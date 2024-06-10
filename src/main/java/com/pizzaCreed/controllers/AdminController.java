package com.pizzaCreed.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pizzaCreed.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
    private AdminService adminService;

    @GetMapping("/admin/login")
    public String showLoginForm() {
        return "adminLogin";
    }

    @PostMapping("/admin/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (adminService.validateAdmin(username, password)) {
            return "redirect:/admin/dashboard";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "adminLogin";
        }
    }

    @GetMapping("/admin/dashboard")
    public String showDashboard() {
        return "index";
    }


}
