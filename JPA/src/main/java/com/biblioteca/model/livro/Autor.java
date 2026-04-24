package com.biblioteca.model.livro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;



@Setter @Getter
@Entity
@Table(name = "TB_AUTOR" )
public class Autor implements Serializable {
    private static final long serialVersionUID =1L;

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_Autor;

    @Column(nullable = false, unique = true)
    private String NomeAutor;

    @Column(nullable = false,unique = false)
    private LocalDate dataNascimento;

    @Column(nullable = false,unique = false )
    private String bioAutor;

    public Autor(UUID id_Autor, String nomeAutor, LocalDate dataNascimento, String bioAutor) {
        this.id_Autor = id_Autor;
        NomeAutor = nomeAutor;
        this.dataNascimento = dataNascimento;
        this.bioAutor = bioAutor;
    }
}
