package com.alberto.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/productos")
public class productoController {

	@GetMapping("")
	public String showProductos() {
		return "productos/show";
	}
}
