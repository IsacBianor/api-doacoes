package com.estudoapi.doacao.data.datasource.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.estudoapi.doacao.data.datasource.CategoriaDataSource;
import com.estudoapi.doacao.data.datasource.JpaCategoriaRepository;
import com.estudoapi.doacao.data.models.CategoriaModel;

@Component
public class CategoriaDataSourceImpl implements CategoriaDataSource {

	final JpaCategoriaRepository repository;
	
	public CategoriaDataSourceImpl(JpaCategoriaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public void criarCategoria(CategoriaModel categoria) {
		repository.save(categoria);
	}

	@Override
	public CategoriaModel buscarCategoria(Long id) {
		Optional<CategoriaModel> op = repository.findById(id);
		return op.get();
	}

	@Override
	public List<CategoriaModel> buscarCategorias() {
		return repository.findAll();
	}

	@Override
	public void atualizarCategoria(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarCategoria(Long id) {
		repository.deleteById(id);
	}

}
