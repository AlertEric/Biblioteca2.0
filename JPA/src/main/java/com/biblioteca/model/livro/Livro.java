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

    public Livro(UUID id_livro, int quantidade,LocalDate dataCadastro, LocalDate dataLancamento, String nomeDoLivro) {
        this.id_livro = id_livro;
        this.quantidade = quantidade;
        this.dataCadastro = dataCadastro;
        this.dataLancamento = dataLancamento;
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public TipoLivro getGenero() {
        return genero;
    }

    public void setGenero(TipoLivro genero) {
        this.genero = genero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}