package com.alberto.ecommerce.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alberto.ecommerce.models.Producto;
import com.alberto.ecommerce.models.Usuario;
import com.alberto.ecommerce.services.IProductoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@RequestMapping("/productos")
public class productoController {
	
	private Logger log = LoggerFactory.getLogger(productoController.class);

	@Autowired
	IProductoService productoService;
	
	//El objeto model lleva datos del back a la vista
	@GetMapping("")
	public String showProductos(Model model) {
		model.addAttribute("productos", productoService.getProductos());
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
	
	@GetMapping("/edit/{id}")
	public String editaProducto(@PathVariable Integer id, Model model) {
		log.info("ID:"+id);
		Producto p = productoService.getProductoById(id);
		
		if(p!=null) {
			log.info(p.toString());
			model.addAttribute("producto", p);
			return "productos/edit";
		}
		else {
			log.error("No se encuentra el producto");
			return "redirect:/productos";
		}
	}

	@PostMapping("/update")
	public String updateProducto(Producto producto) {
		log.info(producto.toString());
		productoService.saveProducto(producto);
		
		return "redirect:/productos";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminaProducto(@PathVariable Integer id) {
		log.info("eliminaProducto:: "+id);
		productoService.deleteProductoById(id);
		return "redirect:/productos";
	}
}
