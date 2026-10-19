package com.biblioteca.repository.biblioteca;

import com.biblioteca.model.livro.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public  interface LivrosRepository extends JpaRepository<Livro, Integer> {


    @Override
    List<Livro> findAll();

    @Query(" SELECT alias FROM Livro alias where genere = :genero ")
    List<Livro> QUERY_LISTAR_LIVRO_POR_GENERO();






}
