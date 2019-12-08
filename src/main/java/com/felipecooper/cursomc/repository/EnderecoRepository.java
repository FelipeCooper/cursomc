package com.felipecooper.cursomc.repository;

import com.felipecooper.cursomc.entity.Categoria;
import com.felipecooper.cursomc.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

    
}

