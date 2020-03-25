package com.jandremoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jandremoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
}
