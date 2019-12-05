package com.felipecooper.cursomc.service;

import java.util.Optional;

import com.felipecooper.cursomc.entity.Categoria;
import com.felipecooper.cursomc.repository.CategoriaRepository;

import com.felipecooper.cursomc.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){

        Optional<Categoria> obj =  categoriaRepository.findById(id);
        return obj.orElseThrow( ()->new ObjectNotFoundException("Objeto não encontrado! Id: "+id+" Tipo: "+Categoria.class));
    }

    public Categoria salvar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
    
}