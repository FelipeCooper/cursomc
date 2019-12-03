package com.felipecooper.cursomc.service;

import java.util.Optional;

import com.felipecooper.cursomc.entity.Categoria;
import com.felipecooper.cursomc.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Optional<Categoria> buscar(Integer id){
        return categoriaRepository.findById(id);
    }

    public Categoria salvar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
    
}