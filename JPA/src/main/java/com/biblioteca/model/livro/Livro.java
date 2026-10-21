package com.biblioteca.model.livro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.biblioteca.model.enums.TipoLivro;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name ="TB_LIVRO")
@Getter @Setter
@Service
public class Livro implements Serializable {

    @Serial
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

    public Livro(UUID id_livro, Editora editora, TipoLivro genero, LocalDate dataLancamento, String nomeDoLivro, LocalDate dataCadastro, int quantidade) {
        this.id_livro = id_livro;
        this.editora = editora;
        this.genero = genero;
        this.dataLancamento = dataLancamento;
        this.nomeDoLivro = nomeDoLivro;
        this.dataCadastro = dataCadastro;
        this.quantidade = quantidade;
    }
}