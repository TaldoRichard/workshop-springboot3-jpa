package com.educandoweb.projeto_curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.projeto_curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
