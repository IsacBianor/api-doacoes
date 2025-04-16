package com.estudoapi.doacao.domain.repositories;

import com.estudoapi.doacao.domain.entities.Usuario;

public interface UsuarioRepository {

	public void criarUsuario(Usuario usuario);
	public Usuario buscarUsuario(Long id);
	public void atualizarUsuario(Long id);
	public void deletarUsuario(Long id);
	
}
