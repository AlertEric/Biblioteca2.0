package com.biblioteca.model.enums;

import lombok.Getter;


@Getter
public enum TipoUsuario {
        ALUNO (1),
        FUNCIONARIO(2);

        private int codigo;


    TipoUsuario(int codigo) {
            this.codigo = codigo;

    }

}
