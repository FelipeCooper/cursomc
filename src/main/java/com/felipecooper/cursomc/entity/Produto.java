package com.felipecooper.cursomc.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;
    @JsonBackReference
    @ManyToMany
    @JoinTable(name = "PRODUTO_CATEGORIA",
            joinColumns = @JoinColumn(name = "produto_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private List<Categoria> categorias = new ArrayList<>();

    public Produto(Integer id, String nome, Double preco) {
        this.id=id;
        this.nome=nome;
        this.preco=preco;
    }
}