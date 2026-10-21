package com.biblioteca.repository.biblioteca;

import com.biblioteca.model.livro.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public  interface LivrosRepository extends JpaRepository<> {


    @Query(" SELECT alias FROM Livro alias ")
    List<Livro> QUERY_LISTAR_LIVRO();






}
