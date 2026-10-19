package com.biblioteca.controller.casesMenus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;
import com.biblioteca.controller.cadlogin.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.System.exit;

@RestController
public class CaseMenu  {

    Scanner scanner = new Scanner(System.in);
    public static final Logger LOGGER = LoggerFactory.getLogger(CaseMenu.class);

    private final CadController cadControllerUsurious;
    private final LoginController loginControllerUsurious;

    @Autowired
    public CaseMenu(LoginController loginController,CadController cadUsurious) {
        loginControllerUsurious = loginController;
        cadControllerUsurious = cadUsurious;
    }

    public void CaseMenusAcesso() {

        LOGGER.info("Digite 1 - Para Login | 2 - Para Cadastro | 3 - sair ");


        int opcao;
        do {
              opcao = scanner.nextInt();

            if(   opcao < 0 || opcao > 3) {

            } else {


                switch (opcao) {
                    case 0:

                        loginControllerUsurious.loginUsuario();

                        break;

                    case 2:
                        cadControllerUsurious.cadastroUsuario();

                        break;

                    case 3:
                        exit(0);
                    default:
                        LOGGER.info("Opção inválida, digite novamente");
                }

            }

            }while (opcao != 4) ;
        }
}

