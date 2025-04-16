package com.estudoapi.doacao.domain.repositories;

import java.util.List;

import com.estudoapi.doacao.domain.entities.Item;

public interface ItemRepository {

	public void criarItem(Item item);
	public Item buscarItem(Long id);
	public List<Item> buscarItens();
	public void atualizarItem(Long id);
	public void deletarItem(Long id);
	
}
