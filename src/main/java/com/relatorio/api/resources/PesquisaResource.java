package com.relatorio.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relatorio.api.models.Pesquisa;
import com.relatorio.api.repository.PesquisaRepository;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api")
public class PesquisaResource {
	
	@Autowired
	PesquisaRepository pesquisaRepository;
	
	@GetMapping("/pesquisas")
	public List<Pesquisa> listaPesquisas() {
		return pesquisaRepository.findAll();
	}
	
	@GetMapping("/pesquisas/{id}")
	public Pesquisa listaPesquisasUnico(@PathVariable(value="id") long id) {
		return pesquisaRepository.findById(id);
	}
	
	@PostMapping("/pesquisas")
	public Pesquisa salvaPesquisa(@RequestBody Pesquisa pesquisa) {
		return pesquisaRepository.save(pesquisa);
	}
	
}
