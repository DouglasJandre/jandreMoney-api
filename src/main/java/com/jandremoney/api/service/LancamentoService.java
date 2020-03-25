package com.jandremoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jandremoney.api.model.Lancamento;
import com.jandremoney.api.model.Pessoa;
import com.jandremoney.api.repository.LancamentoRepository;
import com.jandremoney.api.repository.PessoaRepository;
import com.jandremoney.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo())
				.orElseThrow(() -> new PessoaInexistenteOuInativaException());
		
		if (pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentoRepository.save(lancamento);
	}
	
}
