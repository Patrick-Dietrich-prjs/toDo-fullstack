package com.patrick.toDo_backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "toDo")
public class toDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "criado_em")
    private LocalDate criado_em;
}
