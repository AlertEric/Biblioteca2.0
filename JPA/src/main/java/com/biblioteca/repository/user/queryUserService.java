package com.biblioteca.repository.user;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.sql.Date;

public class queryUserService {

public static class QUERYS_USUARIOS_CADASTRO {

    @Modifying
    @Query(value = " insert into TB_Usuarios " +
            "(  nome_Usuario, cpf, data_Nacimento, login_Usuario, senha, tipo_Usuario, data_Cadastro ) " +
            "values " +
            "(:nomeUsuario, :cpf, :dataNascimento, :loginUsuario, :senha, :tipoUsuario, :cadastroData)", nativeQuery = true)
    void insertUser(
         @Param("nomeUsuario") String nomeUsuario,
         @Param("cpf") String cpf,
         @Param("dataNascimento") String dataNascimento,
         @Param("loginUsuario") String loginUsuario,
         @Param("senha") String senha,
         @Param("tipoUsuario") int tipoUsuario,
         @Param("cadastroData") Date cadastroData) {
    }
}


}
