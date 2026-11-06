package com.biblioteca.service.CadastroService;


import com.biblioteca.dto.CadastroRequest;
import com.biblioteca.service.ValidacaoSevice.Email.ValidaEmail;
import lombok.NonNull;

import java.util.Map;


public interface CadastroService {


   boolean VALIDA_EMAIL_MAP
    void METODO_CADASTRA_USUARIO_BANCO(CadastroRequest cadastro);

    boolean METODO_VALIDA_SENHA(@NonNull CadastroRequest cadastro);

    boolean METODO_VALIDA_CPF();
}

