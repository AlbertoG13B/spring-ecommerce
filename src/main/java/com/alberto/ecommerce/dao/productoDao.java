package com.alberto.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alberto.ecommerce.models.Producto;

public interface productoDao extends JpaRepository<Producto, Integer>{

}
