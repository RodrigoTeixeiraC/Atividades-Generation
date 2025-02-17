package com.lojaGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaGames.model.Jogo;
import com.lojaGames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	private @Autowired ProdutoRepository repositoryProduto;
	
	@GetMapping("/todos")
	public ResponseEntity<List<Jogo>> getAll(){
		return ResponseEntity.ok(repositoryProduto.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Jogo> GetById(@PathVariable long id) {
		return repositoryProduto.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/tipo")
	public ResponseEntity<List<Jogo>> GetByDescricao(@RequestBody String nome){
		return ResponseEntity.ok(repositoryProduto.findByNome(nome));
	}
	
	@PostMapping
	public ResponseEntity<Jogo> post (@RequestBody Jogo produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryProduto.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Jogo> put (@RequestBody Jogo produto){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryProduto.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable long id) {
		repositoryProduto.deleteById(id);
	}

}
