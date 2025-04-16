package com.estudoapi.doacao.data.models;

import java.util.List;
import java.util.stream.Collectors;

import com.estudoapi.doacao.domain.entities.Categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	public CategoriaModel() {
		super();
	}

	public CategoriaModel(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria toCategoria(CategoriaModel categoriaModel){
		Categoria categoria = new Categoria();
		categoria.setId(categoriaModel.getId());
		categoria.setNome(categoriaModel.getNome());
		return categoria;
	}

	public List<Categoria> toCategoriaList(List<CategoriaModel> categoriaModel){
		return categoriaModel.stream().map(temp -> {
			Categoria obj = new Categoria();
			obj.setId(temp.getId());
			obj.setNome(temp.getNome());
			return obj;
		}).collect(Collectors.toList());
		
	}

	public CategoriaModel toCategoriaModel(Categoria categoria){
		CategoriaModel categoriaModel = new CategoriaModel();
		categoriaModel.setId(categoria.getId());
		categoriaModel.setNome(categoria.getNome());
		return categoriaModel;
	}
	
}
