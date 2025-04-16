package com.estudoapi.doacao.data.datasource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudoapi.doacao.data.models.CategoriaModel;

@Repository
public interface JpaCategoriaRepository extends JpaRepository<CategoriaModel, Long>{

}
