package com.felipecooper.cursomc.resources;

import com.felipecooper.cursomc.entity.Categoria;
import com.felipecooper.cursomc.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService;

    @GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<?> mostrar(@PathVariable("id") Integer id) {
		return ResponseEntity.ok().body(categoriaService.buscar(id));
	}

	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody Categoria categoria){
		return ResponseEntity.ok().body(categoriaService.salvar(categoria));
	}
}
