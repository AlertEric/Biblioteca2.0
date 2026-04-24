package com.biblioteca.model.usuario;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.biblioteca.model.enums.TipoUsuario;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name ="TB_Usuarios")
@Getter @Setter
public class Usuario implements Serializable {
    private static final long serialVersionUID=1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;

    @Column(nullable = false, unique = true)
    private String nomeUsuario;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = false)
    private LocalDate dataNacimento;
    @Column(nullable = false, unique = true)
    private String logUsuario;

    @Column(nullable = false, unique = false)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private TipoUsuario tipoUsuario;

    @Column(nullable = false, unique = false)
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


