package com.gamerloot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gl_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String nome;

    @Column(nullable = false)
    private Long iddacategoria;



}
