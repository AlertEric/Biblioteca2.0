package com.biblioteca.dto;


import lombok.Getter;
import lombok.Setter;



import java.time.LocalDate;

@Getter
@Setter
public class CadastroRequest {


    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String email;
    private String validaEmail;
    private String senha;
    private String validaSenha;

}
