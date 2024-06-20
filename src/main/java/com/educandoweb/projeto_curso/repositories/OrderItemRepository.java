package com.educandoweb.projeto_curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto_curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
