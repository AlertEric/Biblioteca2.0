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

public class Usuarios implements Serializable {
    private static final long serialVersionUID=1;

    public Usuarios(int idUsuario, String senha, LocalDate dataNacimento, String nomeUsuario, String cpf, LocalDate cadastroData) {
        this.idUsuario = idUsuario;
        this.senha = senha;
        this.dataNacimento = dataNacimento;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.cadastroData = cadastroData;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idUsuario;

    @Column(nullable = false, unique = true)
    protected String nomeUsuario;

    @Column(nullable = false, unique = true)
    protected String cpf;

    @Column(nullable = false, unique = false)
    protected LocalDate dataNacimento;

    @Column(nullable = false, unique = false)
    protected String senha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    protected TipoUsuario tipoUsuario;

    @Column(nullable = false, unique = false)
    protected LocalDate cadastroData;
}


