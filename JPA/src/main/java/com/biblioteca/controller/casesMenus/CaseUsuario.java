package com.biblioteca.controller.casesMenus;


import com.biblioteca.service.LivroService.LivroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.biblioteca.controller.casesBiblioteca.usuarioCliente.*;
import org.springframework.stereotype.Service;


import java.util.Scanner;
import static java.lang.System.exit;



@Service
public class CaseUsuario {

    Scanner scanner = new Scanner(System.in);
    public static final Logger LOGGERs = LoggerFactory.getLogger(CaseUsuario.class);

    private final LivroService livroService;

    @Override
    public CaseUsuario(LivroService solicitacaoLivro){
        livroService = solicitacaoLivro;
    }

    public void caseMenuUsuario() {

        LOGGERs.info(" Escolha sua ação");
        LOGGERs.info("1 - Emprestimo | 2 - devolução | 3 - Comprar | 4 - Meu Usurious | 5- Logoff");

        int opcao = scanner.nextInt();
        do {

            if (Boolean.parseBoolean(Integer.toString(opcao)) || opcao <= 0 || opcao >= 5) {

            } else {

                switch (opcao) {

                    case 0:

                        livroService.livroEmprestimo();

                        break;

                    case 1:

                        MenuDevolucaoController.solicitacaoDeDevolucao();;

                        break;

                    case 2:

                        menuCompraController.solicitacaoDeCompra();

                        break;

                    case 3:

                        atualizacaoUsuarioController.AtualizacaoDeDados();

                        break;

                    case 4:
                        exit(0);
                    default:
                        LOGGERs.info("Opção inválida, digite novamente");
                }

            }
        } while (opcao != 5);


    }

}
