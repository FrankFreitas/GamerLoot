package com.gamerloot.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "gl_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String nome;

    @Column(nullable = false,length = 50)
    private String Sobrenome;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date datadenascimento;

    @Column(nullable = false, length = 11)
    @DateTimeFormat(pattern = "###-###-###-##")
    private String cpf;

   // private String endereco;

}
