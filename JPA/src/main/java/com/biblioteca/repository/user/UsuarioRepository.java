package com.biblioteca.repository.user;

import com.biblioteca.model.usuario.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UsuarioRepository extends JpaRepository<Usuarios, Integer> {

        @Query
        boolean existsBycpf (String cpf);


}
