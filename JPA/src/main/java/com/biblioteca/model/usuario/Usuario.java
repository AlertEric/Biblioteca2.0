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

    public Usuario(int idUsuario, String senha, String logUsuario, LocalDate dataNacimento, String nomeUsuario, String cpf, LocalDate cadastroData) {
        this.idUsuario = idUsuario;
        this.senha = senha;
        this.logUsuario = logUsuario;
        this.dataNacimento = dataNacimento;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.cadastroData = cadastroData;
    }
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
}


