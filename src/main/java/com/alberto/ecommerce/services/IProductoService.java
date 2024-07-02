package com.alberto.ecommerce.services;

import java.util.List;

import com.alberto.ecommerce.models.Producto;

public interface IProductoService {

	public Producto getProductoById(Integer id);
	
	public List<Producto> getProductos();
	
	public Producto saveProducto(Producto producto);
	
	public Producto update(Producto producto);
	
	public void deleteProductoById(Integer id);
}
