package com.biblioteca.repository.user;

import com.biblioteca.model.usuario.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer > {


        boolean existsBycpf (String cpf);










}
