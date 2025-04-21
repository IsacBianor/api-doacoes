package com.estudoapi.doacao.domain.usecases.categoria;

import org.springframework.stereotype.Component;

import com.estudoapi.doacao.domain.entities.Categoria;
import com.estudoapi.doacao.domain.repositories.CategoriaRepository;

@Component
public class CriarCategoria {

	final CategoriaRepository repository;

	public CriarCategoria(CategoriaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public void call(Categoria categoria) {
		repository.criarCategoria(categoria);
	}
	
}
