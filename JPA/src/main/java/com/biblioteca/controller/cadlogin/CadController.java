package com.biblioteca.controller.cadlogin;


import com.biblioteca.model.usuario.Usuarios;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.Scanner;

@Service
public final class CadController {
    public CadController() {}

    private static Usuarios usuario;

    public  void  cadastroUsuario() {


        Scanner scanner = new Scanner(System.in);
        final Logger LOGGER = LoggerFactory.getLogger(CadController.class);

        LOGGER.info("DIGITE SEU NOME");
        usuario.setNomeUsuario(scanner.nextLine());

        LOGGER.info("DIGITE SEU CPF");
        usuario.setCpf(scanner.next());

        LOGGER.info("DIGITE SUA DATA DE NASCIMENTO");
        usuario.setDataNacimento(LocalDate.parse(scanner.next()));

        LOGGER.info("DIGITE SEU LOGIN DE ACESSO");
        usuario.setLogUsuario(scanner.next());

        LOGGER.info("DIGITE SUA SENHA DE ACESSO");
        LOGGER.info("senha deve conter (letra, numeros e simbolos)");
        usuario.setSenha(scanner.next());


    }



}
