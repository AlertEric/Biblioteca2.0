package com.biblioteca.model.emprestimo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.rmi.server.UID;
import java.time.LocalDate;

@Entity
@Table(name = "TB_EMPRESTIMOS")
@Getter @Setter
public class Empretimos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UID id_Emprestimo;

    @Column(nullable = false,unique = true)
    private LocalDate dataEmprestimo;

    @Column(nullable = false, insertable = true)
    private LocalDate dataDevolucao;

    public Empretimos(UID id_Emprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.id_Emprestimo = id_Emprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
}
