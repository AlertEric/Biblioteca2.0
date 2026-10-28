package com.biblioteca.service.UsuarioService;

import com.biblioteca.dto.CadastroRequest;
import com.biblioteca.model.usuario.Usuarios;
import com.biblioteca.repository.user.UsuarioRepository;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.Objects;
@Service

public class cadastroService {

    public boolean METODO_VALIDA_EMAIL(@NonNull CadastroRequest cadastro) {

        boolean result;

        final Logger LOGGER = LoggerFactory.getLogger(cadastroService.class);

        result = Objects.equals(cadastro.getEmail(), cadastro.getValidaEmail());

        if (!result) {

            LOGGER.error(" EMAIL NÃO CORRESPONDEM ");
        }
        return result;
    }


    public void  METODO_INSERT_USUARIO_BANCO(Usuarios usuarios , UsuarioRepository salvaUsuario)  {



    }

    public boolean METODO_VALIDA_SENHA(@NonNull CadastroRequest cadastro) {

        boolean result;


        final Logger LOGGER = LoggerFactory.getLogger(cadastroService.class);

        result = Objects.equals(cadastro.getSenha(), cadastro.getValidaSenha());

        if (!result) {

            LOGGER.error("SENHAS NÃO CORRESPONDEM ");
        }
        return result;
    }
}

