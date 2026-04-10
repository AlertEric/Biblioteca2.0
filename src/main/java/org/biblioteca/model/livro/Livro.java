package org.biblioteca.model.livro;

import lombok.Getter;
import lombok.Setter;
import org.biblioteca.model.enums.TipoLivro;

import java.time.LocalDate;

@Getter @Setter
public class Livro {
    private int id_livro;
    private String nomeDoLivro;
    private LocalDate dataLancamento;
    private LocalDate dataCadastro;
    private TipoLivro genero;
    private int quantidade;

    public Livro(int id_livro, int quantidade,LocalDate dataCadastro, LocalDate dataLancamento, String nomeDoLivro) {
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