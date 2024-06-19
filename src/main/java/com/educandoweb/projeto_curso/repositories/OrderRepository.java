package com.educandoweb.projeto_curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto_curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
