package com.biblioteca.model.livro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.biblioteca.model.enums.TipoLivro;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name ="TB_LIVRO")
@Getter @Setter

public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_livro;

    @Column(nullable = false,unique = true)
    private String nomeDoLivro;

    @Column(nullable = false,unique = false)
    private LocalDate dataLancamento;

    @Column(nullable = false,unique = false)
    private LocalDate dataCadastro;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = false)
    private TipoLivro genero;

    @Column(nullable = false)
    private int quantidade;

    @ManyToOne
    @JoinColumn(name ="id_Editota")
    private Editora editora;

    public Livro(UUID id_livro, int quantidade,LocalDate dataCadastro, LocalDate dataLancamento, String nomeDoLivro) {
        this.id_livro = id_livro;
        this.quantidade = quantidade;
        this.dataCadastro = dataCadastro;
        this.dataLancamento = dataLancamento;
        this.nomeDoLivro = nomeDoLivro;
    }


}