package com.jandremoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jandremoney.api.model.Lancamento;
import com.jandremoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
