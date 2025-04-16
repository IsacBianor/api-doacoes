package com.estudoapi.doacao.data.datasource;

import com.estudoapi.doacao.data.models.UsuarioModel;

public interface UsuarioDataSource {

	public void criarUsuario(UsuarioModel usuario);
	public UsuarioModel buscarUsuario(long id);
	public void atualizarUsuario(long id);
	public void deletarUsuario(long id);

}
