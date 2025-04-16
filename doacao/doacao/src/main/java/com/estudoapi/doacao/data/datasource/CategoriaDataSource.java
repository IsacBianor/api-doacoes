package com.estudoapi.doacao.data.datasource;

import java.util.List;
import java.util.Optional;

import com.estudoapi.doacao.data.models.CategoriaModel;

public interface CategoriaDataSource {

	public void criarCategoria(CategoriaModel categoria);
	public CategoriaModel buscarCategoria(Long id);
	public List<CategoriaModel> buscarCategorias();
	public void atualizarCategoria(Long id);
	public void deletarCategoria(Long id);
	
}