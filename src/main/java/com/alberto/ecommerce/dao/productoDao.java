package com.alberto.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alberto.ecommerce.models.Producto;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Integer>{

}
