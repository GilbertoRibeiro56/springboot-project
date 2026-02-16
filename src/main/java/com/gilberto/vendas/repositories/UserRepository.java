package com.gilberto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gilberto.vendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
