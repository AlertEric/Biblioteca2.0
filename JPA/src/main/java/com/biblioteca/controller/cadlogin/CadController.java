package com.biblioteca.controller.cadlogin;


import com.biblioteca.dto.CadastroRequest;
import com.biblioteca.model.usuario.Usuarios;
import com.biblioteca.service.UsuarioService.cadastroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cadastro")
public final class CadController {



    @PostMapping
    public  void  cadastroUsuario( @RequestBody CadastroRequest cadastro) {
        final Logger LOGGER = LoggerFactory.getLogger(CadController.class);

        Usuarios usuarios = new Usuarios();

        LOGGER.info("Recebe nome do usuario");
        usuarios.setNomeUsuario(cadastro.getNome());

        LOGGER.info("RECEBE_SOBRENO_USUARIO");
        usuarios.setSobrenome(cadastro.getSobrenome());

        LOGGER.info("RECEBE_CPF_USUARIO");
        usuarios.setCpf(cadastro.getCpf());

        LOGGER.info("RECEBE_EMAIL");

        LOGGER.info("RECEBE_EMAIL_VIDAÇÃO");
        usuarios.setValidasenha(cadastro.getValidaEmail());

        LOGGER.info("RECEBE_SENHA");
        usuarios.setSenha(cadastro.getSenha());

        LOGGER.info("RECEBE_SENHA_VIDAÇÃO");
        usuarios.setValidasenha(cadastro.getValidaSenha());

        LOGGER.info("RECEBE_DATANASCIMENTO");
        usuarios.setDataNacimento(cadastro.getDataDeNascimento());

    }


    public cadastroService serviceCad;
    public CadController(cadastroService validacao) {
        serviceCad = validacao;

    }

}
