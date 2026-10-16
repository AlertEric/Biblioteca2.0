package com.biblioteca.service.LivroService;


import com.biblioteca.controller.casesBiblioteca.usuarioCliente.MenuEmprestimo;
import com.biblioteca.repository.biblioteca.LivrosRepository;
import com.biblioteca.repository.user.UsuarioRepository;
import org.springframework.stereotype.Service;


@Service
public final class LivroService   {

    private static LivrosRepository querysLivros;
    private static MenuEmprestimo menuEmprestimo;
    private static UsuarioRepository queryUsuario;

    public LivroService(LivrosRepository querys_livros, MenuEmprestimo solicitaemprestimo,UsuarioRepository Query_Usuario  ) {
       querysLivros = querys_livros;
       menuEmprestimo = solicitaemprestimo;
        queryUsuario = Query_Usuario;
    }

    public void livroEmprestimo()  {


    querysLivros.QUERY_LISTAR_LIVRO();

    menuEmprestimo.solicitacaoDeEmprestimo();



    }



}
