package com.biblioteca.controller.casesBiblioteca.usuarioCliente;

import com.biblioteca.model.livro.Livro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class MenuEmprestimo  {

    public final Livro dadosLivro;
    public static final Logger LOGGER = LoggerFactory.getLogger(MenuEmprestimo.class);

    public MenuEmprestimo(Livro dadosLivro1) {
        dadosLivro = dadosLivro1;
    }

    Scanner scanner = new Scanner(System.in);

    public void solicitacaoDeEmprestimo(){
    LOGGER.info(" Digite o numero do livro que deseja");


    }

}
