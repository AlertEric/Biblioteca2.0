package com.biblioteca.model.livro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "TB_EDITORA")
@Getter @Setter
public class Editora implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_Editota;

    @Column(nullable = false,unique = true)
    private String nomeEditora;

    @Column (nullable = false, unique = false)
    private LocalDate dataLaçamento;

    public Editora(UUID id_Editota, String nomeEditora, LocalDate dataLaçamento) {
        this.id_Editota = id_Editota;
        this.nomeEditora = nomeEditora;
        this.dataLaçamento = dataLaçamento;
    }
}
