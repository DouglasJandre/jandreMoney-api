package com.jandremoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jandremoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
