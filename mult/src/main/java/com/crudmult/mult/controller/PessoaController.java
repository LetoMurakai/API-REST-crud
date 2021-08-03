package com.crudmult.mult.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudmult.mult.model.Pessoa;
import com.crudmult.mult.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
@CrossOrigin("*")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> getAll(){
		return ResponseEntity.ok(pessoaRepository.findAll());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Pessoa> post (@RequestBody Pessoa pessoa){
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaRepository.save(pessoa));
	}
	
	@PutMapping
	public ResponseEntity<Pessoa> pust (@RequestBody Pessoa pessoa){
		return ResponseEntity.status(HttpStatus.OK).body(pessoaRepository.save(pessoa));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void delete(@PathVariable long id) {
		pessoaRepository.deleteById(id);
	}
	
}
