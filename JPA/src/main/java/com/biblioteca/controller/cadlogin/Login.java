package com.biblioteca.controller.cadlogin;
import com.biblioteca.model.usuario.Usuario;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

@Component
public class Login {


    private static Usuario usuario;
    public static void loginUsuario(){
        Scanner scanner= new Scanner(System.in);
        final Logger LOGGER =LoggerFactory.getLogger(Login.class);

        LOGGER.info("Digite seu Login");
        usuario.setLogUsuario(scanner.nextLine());

        LOGGER.info("Digite sua senha");
        usuario.setSenha(scanner.nextLine());


    }
    
}
