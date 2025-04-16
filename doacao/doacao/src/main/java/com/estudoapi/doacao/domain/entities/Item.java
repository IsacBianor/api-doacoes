package com.estudoapi.doacao.domain.entities;

public class Item {

	private Long id;
	private String nome;
	private Usuario usuario;
	private Categoria categoria;

	public Item() {
		super();
	}

	public Item(Long id, String nome, Usuario usuario, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
