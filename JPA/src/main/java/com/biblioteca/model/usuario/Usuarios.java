package com.biblioteca.model.usuario;

import com.biblioteca.service.UsuarioService.cadastroService;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.biblioteca.model.enums.TipoUsuario;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name ="TB_Usuarios")
@Getter @Setter

public class Usuarios implements Serializable {
    @Serial
    private static final long serialVersionUID=1;

    public Usuarios(int idUsuario, String senha,String sobrenome ,LocalDate dataNacimento, String nomeUsuario, String cpf, String email, String validaEmail, String validaSenha) {
        this.idUsuario = idUsuario;
        this.senha = senha;
        this.dataNacimento = dataNacimento;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
        this.email = email;
        this.validaEmail = validaEmail;
       this.validasenha  = validaSenha;

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


    @Column(nullable = false, unique = false)
    private String senha;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private TipoUsuario tipoUsuario;

    @Column(nullable = false, unique = false)
    private String sobrenome;

    @Column(nullable = false, unique= true)
    private  String email;



    private  String validaEmail;

    private  String validasenha;


    public Usuarios() {

    }
}


