package com.alberto.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/administrador")
public class administradorController {

	@GetMapping("")
	public String home() {
		return "administrador/home";
	}
	
}
