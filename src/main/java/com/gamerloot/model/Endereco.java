package com.gamerloot.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gl_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 8)
    @DateTimeFormat(pattern = "#####-###")
    private String cep;

    @Column(nullable = false,length = 6)
    private int num;
}
