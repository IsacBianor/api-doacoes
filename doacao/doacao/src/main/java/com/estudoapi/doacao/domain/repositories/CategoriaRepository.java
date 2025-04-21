package com.estudoapi.doacao.domain.repositories;

import java.util.List;

import com.estudoapi.doacao.domain.entities.Categoria;

public interface CategoriaRepository {

	public void criarCategoria(Categoria categoria);
	public Categoria buscarCategoria(Long id);
	public Categoria buscarCategoriaPorNome(String nome);
	public List<Categoria> buscarCategorias();
	public void atualizarCategoria(Long id);
	public void deletarCategoria(Long id);
	
}
