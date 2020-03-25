package com.jandremoney.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jandremoney.api.model.Lancamento;
import com.jandremoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
