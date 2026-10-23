package com.biblioteca.service.UsuarioService;

import com.biblioteca.controller.cadlogin.CadController;
import com.biblioteca.dto.CadastroRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public  class  cadastroService {


    public Boolean METODO_VALIDA_EMAIL(CadastroRequest cadastro) {

        boolean result;

        final Logger LOGGER = LoggerFactory.getLogger(CadController.class);

        result = Objects.equals(cadastro.getEmail(), cadastro.getValidaEmail());

        if (!result) {

            LOGGER.error(" EMAIL INCORRETO ");
        }
        return true;
    }





}

