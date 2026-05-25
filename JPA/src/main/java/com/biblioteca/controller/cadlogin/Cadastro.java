package com.biblioteca.controller.cadlogin;


import com.biblioteca.model.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
public final class Cadastro extends Usuario  {

    public static void  cadastroUsuario() {

        Scanner scanner = new Scanner(System.in);
        final Logger LOGGER = LoggerFactory.getLogger(Cadastro.class);

        LOGGER.info("DIGITE SEU NOME");
        String Nome= scanner.next();


    }



}
