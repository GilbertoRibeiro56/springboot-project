package com.gilberto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilberto.vendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
