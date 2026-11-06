package com.biblioteca.service.CadastroService;


import com.biblioteca.dto.CadastroRequest;
import com.biblioteca.model.usuario.Usuarios;
import com.biblioteca.repository.user.UsuarioRepository;
import com.biblioteca.service.ValidacaoSevice.Email.ValidaEmail;
import lombok.NonNull;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;



@Service
public class CadastroServiceImpl implements CadastroService {



    @Override
    public Map<Boolean,ValidaEmail > VALIDA_EMAIL_MAP(){
        return verificaEmail.METODO_VALIDA_EMAIL( cadastro);
    }

    @Override
    public void METODO_CADASTRA_USUARIO_BANCO(CadastroRequest cadastro ) {

        final Logger LOGGER = LoggerFactory.getLogger(CadastroServiceImpl.class);
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

        dados.save(usuarios);

    }


    @Override
    public boolean METODO_VALIDA_SENHA(@NonNull CadastroRequest cadastro) {
        boolean result;


        final Logger LOGGER = LoggerFactory.getLogger(CadastroServiceImpl.class);

        result = Objects.equals(cadastro.getSenha(), cadastro.getValidaSenha());

        if (!result) {

            LOGGER.error("SENHAS NÃO CORRESPONDEM ");
        }
        return result;
    }


    @Override
    public boolean METODO_VALIDA_CPF(@NonNull CadastroRequest cadastro){
        boolean result;
        result = Objects.compare(cadastro.getCpf(), me)

        return result;
    }

    private final UsuarioRepository dados;
    private  final Usuarios usuarios;
    private ValidaEmail verificaEmail;

    public CadastroServiceImpl(UsuarioRepository dadosUsuario, Usuarios objetoUsuarios, ValidaEmail DadosEmail){
    dados = dadosUsuario;
    usuarios = objetoUsuarios;
    verificaEmail = DadosEmail;
}
}
