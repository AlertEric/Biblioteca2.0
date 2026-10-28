package com.biblioteca.controller.cadlogin;


import com.biblioteca.dto.CadastroRequest;
import com.biblioteca.model.usuario.Usuarios;
import com.biblioteca.service.UsuarioService.cadastroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cadastro")
public final class CadController {


    @PostMapping
    public ResponseEntity<Void> cadastroUsuario(@RequestBody CadastroRequest cadastro) {

        final Logger LOGGER = LoggerFactory.getLogger(CadController.class);

        Usuarios usuarios = new Usuarios();

        boolean resultEmail;
        resultEmail = serviceCad.METODO_VALIDA_EMAIL(cadastro);

        boolean resultSenha;
        resultSenha = serviceCad.METODO_VALIDA_SENHA(cadastro);

        ResponseEntity.BodyBuilder status;

        if (!(resultEmail && resultSenha)) {

            LOGGER.error("EMAIL E SENHAS NÃO CORRESPONDEM");
            status = ResponseEntity.status(HttpStatusCode.valueOf(400));

            return status.build();

        } else {

            LOGGER.info("Recebe nome do usuario");
            usuarios.setNomeUsuario(cadastro.getNome());

            LOGGER.info("RECEBE_SOBRENO_USUARIO");
            usuarios.setSobrenome(cadastro.getSobrenome());

            LOGGER.info("RECEBE_CPF_USUARIO");
            usuarios.setCpf(cadastro.getCpf());

            usuarios.setEmail(cadastro.getEmail());
            usuarios.setSenha(cadastro.getSenha());

            LOGGER.info("RECEBE_DATANASCIMENTO");
            usuarios.setDataNacimento(cadastro.getDataDeNascimento());

            status = ResponseEntity.status(HttpStatusCode.valueOf(201));


        }
        return status.build();

    }

    private cadastroService serviceCad;

    public CadController(cadastroService validacao) {
        serviceCad = validacao;

    }

}
