package com.biblioteca.repository.user;

import com.biblioteca.model.usuario.Usuarios;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;


public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {

        @Query
        boolean existsBycpf (String cpf);



}
