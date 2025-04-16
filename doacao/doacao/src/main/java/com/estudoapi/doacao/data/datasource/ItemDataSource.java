package com.estudoapi.doacao.data.datasource;

import java.util.List;

import com.estudoapi.doacao.data.models.ItemModel;

public interface ItemDataSource {

	public void criarItem(ItemModel item);
	public ItemModel buscarItem(long id);
	public List<ItemModel> buscarItens();
	public void atualizarItem(long id);
	public void deletarItem(long id);
}
