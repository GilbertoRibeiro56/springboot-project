package com.gilberto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilberto.vendas.entities.OrderItem;
import com.gilberto.vendas.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
