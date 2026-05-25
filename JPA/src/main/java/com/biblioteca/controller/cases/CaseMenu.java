package com.biblioteca.controller.cases;


import com.biblioteca.model.usuario.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.Scanner;
import com.biblioteca.controller.cadlogin.*;
import static java.lang.System.exit;


@Component
public class CaseMenu {

    Scanner scanner = new Scanner(System.in);
    public static final Logger LOGGER = LoggerFactory.getLogger(CaseMenu.class);


    private void cadastroUser(Cadastro cad) {
    cad.cadastroUsuario();
    }

    private void acessoUsuario () {
        Login.loginUsuario();
    }


    public void CaseMenusAcesso() {

        LOGGER.info("Digite 1 - Para Login | 2 - Para Cadastro | 3 - sair ");

        int opcao = 0;

        do {
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                if (opcao < 0 || opcao > 3) {

                } else {


                    switch (opcao) {
                        case 1:
                         acessoUsuario();

                            break;

                        case 2:
                            cadastroUser();

                            break;

                        case 3:
                            exit(0);
                        default:
                            LOGGER.info("Opção inválida, digite novamente");
                    }
                }
            } else {
                opcao = scanner.nextInt();
            }

        } while (opcao != 3);

    }
}
