package com.biblioteca.service.ValidacaoSevice.Email;


import com.biblioteca.dto.CadastroRequest;

import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ValidaEmailCadImpl implements ValidaEmail {


    @Override
    public boolean METODO_VALIDA_EMAIL(@NonNull CadastroRequest cadastro) {
        boolean result;

        final Logger LOGGER = LoggerFactory.getLogger(ValidaEmailCadImpl.class);

        result = Objects.equals(cadastro.getEmail(), cadastro.getValidaEmail());

        if (!result) {

            LOGGER.error(" EMAIL NÃO CORRESPONDEM ");
        }
        return result;
    }

public ValidaEmailCadImpl(){

}

}
