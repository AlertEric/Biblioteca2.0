package org.biblioteca.model.usuario;

import lombok.Getter;
import lombok.Setter;
import org.biblioteca.model.enums.TipoUsuario;
import java.time.LocalDate;

@Getter @Setter
public class Usuario {

    private int idUsuario;
    private String nomeUsuario;
    private String cpf;
    private LocalDate dataNacimento;
    private String logUsuario;
    private String senha;
    private TipoUsuario tipoUsuario;
    private LocalDate cadastroData;

    public Usuario(int idUsuario, String senha, String logUsuario, LocalDate dataNacimento, String nomeUsuario, String cpf, LocalDate cadastroData) {
        this.idUsuario = idUsuario;
        this.senha = senha;
        this.logUsuario = logUsuario;
        this.dataNacimento = dataNacimento;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.cadastroData = cadastroData;
            }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getLogUsuario() {
        return logUsuario;
    }

    public void setLogUsuario(String logUsuario) {
        this.logUsuario = logUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}


