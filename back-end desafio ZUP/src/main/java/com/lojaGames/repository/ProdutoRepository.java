package com.lojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaGames.model.Jogo;

@Repository
public interface ProdutoRepository extends JpaRepository<Jogo, Long> {
	
	public List<Jogo> findByNome(String nome);

}
