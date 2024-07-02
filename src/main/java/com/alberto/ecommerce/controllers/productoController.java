package com.alberto.ecommerce.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alberto.ecommerce.models.Producto;
import com.alberto.ecommerce.models.Usuario;
import com.alberto.ecommerce.services.IProductoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/productos")
public class productoController {
	
	private Logger log = LoggerFactory.getLogger(productoController.class);

	@Autowired
	IProductoService productoService;
	
	@GetMapping("")
	public String showProductos() {
		return "productos/show";
	}

	@GetMapping("/create")
	public String createProducto() {
		return "productos/create";
	}
	
	@PostMapping("/save")
	public String saveProducto(Producto producto) {
		Usuario usuario = new Usuario(1,"","","","","","","");
		producto.setUsuario(usuario);
		log.info(producto.toString());
		productoService.saveProducto(producto);
		
		return "redirect:/productos";
	}
}
