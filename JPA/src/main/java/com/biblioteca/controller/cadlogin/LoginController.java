package com.biblioteca.controller.cadlogin;
import com.biblioteca.model.usuario.Usuarios;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class LoginController {
    public LoginController() {
    }

     Usuarios usuario;
    public void loginUsuario(){
        Scanner scanner= new Scanner(System.in);
        final Logger LOGGER =LoggerFactory.getLogger(LoginController.class);

        LOGGER.info("Digite seu Login");


        LOGGER.info("Digite sua senha");



    }
    
}
