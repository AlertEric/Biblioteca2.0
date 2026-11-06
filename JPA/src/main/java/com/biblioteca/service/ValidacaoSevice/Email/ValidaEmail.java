package com.biblioteca.service.ValidacaoSevice.Email;


import com.biblioteca.dto.CadastroRequest;
import lombok.NonNull;

import java.util.Map;

public interface ValidaEmail {


    boolean METODO_VALIDA_EMAIL(@NonNull CadastroRequest cadastro);

}
