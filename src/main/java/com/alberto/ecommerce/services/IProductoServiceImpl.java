package com.alberto.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alberto.ecommerce.dao.ProductoDao;
import com.alberto.ecommerce.models.Producto;

@Service
public class IProductoServiceImpl implements IProductoService {

	@Autowired
	ProductoDao productoDao;

	@Override
	public Producto getProductoById(Integer id) {
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public List<Producto> getProductos() {
		return productoDao.findAll();
	}

	@Override
	public Producto saveProducto(Producto producto) {
		return productoDao.save(producto);
	}

	/*Cuando el id viene no nulo se hace el update*/
	@Override
	public Producto update(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	public void deleteProductoById(Integer id) {
		productoDao.deleteById(id);

	}

}
