package com.estudoapi.doacao.data.repositores;

import java.util.List;

import org.springframework.stereotype.Component;

import com.estudoapi.doacao.data.datasource.CategoriaDataSource;
import com.estudoapi.doacao.data.models.CategoriaModel;
import com.estudoapi.doacao.domain.entities.Categoria;
import com.estudoapi.doacao.domain.repositories.CategoriaRepository;

@Component
public class CategoriaRepositoryImpl implements CategoriaRepository{

	final CategoriaDataSource datasource;
	
	public CategoriaRepositoryImpl(CategoriaDataSource datasource) {
		super();
		this.datasource = datasource;
	}

	@Override
	public void criarCategoria(Categoria categoria) {
		CategoriaModel categoriaModel = new CategoriaModel();
		datasource.criarCategoria(categoriaModel.toCategoriaModel(categoria));
	}

	@Override
	public Categoria buscarCategoria(Long id) {
		CategoriaModel categoriaModel = new CategoriaModel();
		return categoriaModel.toCategoria(datasource.buscarCategoria(id));
	}

	@Override
	public List<Categoria> buscarCategorias() {
		CategoriaModel categoriaModel = new CategoriaModel();
		return categoriaModel.toCategoriaList(datasource.buscarCategorias());
	}

	@Override
	public void atualizarCategoria(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarCategoria(Long id) {
		Categoria categoria = buscarCategoria(id);
		datasource.deletarCategoria(categoria.getId());
	}

}
