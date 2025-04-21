package com.estudoapi.doacao.data.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudoapi.doacao.domain.entities.Categoria;
import com.estudoapi.doacao.domain.repositories.CategoriaRepository;
import com.estudoapi.doacao.domain.usecases.categoria.CriarCategoria;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	final CategoriaRepository repository;
	final CriarCategoria criarCategoriaUseCase;

	public CategoriaController(CategoriaRepository repository, CriarCategoria criarCategoriaUseCase) {
		super();
		this.repository = repository;
		this.criarCategoriaUseCase = criarCategoriaUseCase;
	}

	@GetMapping(path = "/id/{id}")
	public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id){
		return new ResponseEntity<>(repository.buscarCategoria(id), HttpStatus.OK);
	}

	@GetMapping(path = "/nome/{nome}")
	public ResponseEntity<Categoria> buscarPorNome(@PathVariable String nome){
		return new ResponseEntity<>(repository.buscarCategoriaPorNome(nome), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Categoria>> buscarCategorias(){
		return new ResponseEntity<>(repository.buscarCategorias(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> criarCategoria(@RequestBody Categoria categoria){
		criarCategoriaUseCase.call(categoria);
		return new ResponseEntity<>(categoria, HttpStatus.CREATED);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Categoria> deletarPorId(@PathVariable Long id){
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
