package com.relatorio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relatorio.api.models.Pesquisa;

public interface PesquisaRepository extends JpaRepository<Pesquisa, Long>{
	
	Pesquisa findById(long id);
	
}
