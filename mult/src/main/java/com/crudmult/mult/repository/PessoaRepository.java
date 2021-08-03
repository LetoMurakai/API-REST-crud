package com.crudmult.mult.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crudmult.mult.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	public List<Pessoa> findAllByNomeContainingIgnoreCase (String nome);
	
}
