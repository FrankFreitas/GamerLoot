package com.gamerloot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gl_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false)
    private Long precodevenda;

    @Column(nullable = false)
    private Long iddoproduto;

    @Column(nullable = false, length = 255)
    private String categoria;

    @Column(nullable = false,length = 255 )
    private String marca;

    @Column(nullable = false)
    private Long precodecusto;

    @Column(nullable = false, length = 255)
    private String descricao;

    @Column(nullable = true, length = 255)
    private String imagem;

    //cadastrar o produto (nome, preço de venda. id do produto,
    // categoria, marca, preço de custo, descrição, imagem)
    //regras: nome não pode repetir, id do produto não pode repetir,
}
