package com.biblioteca.controller.cadlogin;


import com.biblioteca.dto.CadastroRequest;
import com.biblioteca.model.usuario.Usuarios;
import com.biblioteca.service.CadastroService.CadastroService;
import com.biblioteca.service.ValidacaoSevice.Email.ValidaEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cadastro")
public final class CadController {


    @PostMapping
    public ResponseEntity<Void> cadastroUsuario(@RequestBody CadastroRequest cadastro) {

        final Logger LOGGER = LoggerFactory.getLogger(CadController.class);

        Usuarios usuarios = new Usuarios();

        boolean resultEmail;
        resultEmail = Ver;

        boolean resultSenha;
        resultSenha = serviceCad.METODO_VALIDA_SENHA(cadastro);

        ResponseEntity.BodyBuilder status;

        if (!(resultEmail && resultSenha)) {

            LOGGER.error("EMAIL E SENHAS NÃO CORRESPONDEM");
            status = ResponseEntity.status(HttpStatusCode.valueOf(400));

            return status.build();

        } else {

            serviceCad.METODO_CADASTRA_USUARIO_BANCO(cadastro);

            status = ResponseEntity.status(HttpStatusCode.valueOf(201));

        }return status.build();


    }

    @Autowired
    private CadastroService serviceCad;


    public CadController(CadastroService validacao ) {
        serviceCad = validacao;

    }

}