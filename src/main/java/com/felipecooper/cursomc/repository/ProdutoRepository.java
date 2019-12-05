package com.felipecooper.cursomc.repository;

import com.felipecooper.cursomc.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
