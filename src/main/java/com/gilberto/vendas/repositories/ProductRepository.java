package com.gilberto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilberto.vendas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
