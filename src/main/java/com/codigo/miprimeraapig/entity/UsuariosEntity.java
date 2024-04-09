package com.codigo.miprimeraapig.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UsuariosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // crear y generar el id es la base de datos, delega la resposabilida a la BD
    private Long id;
    private String nombres;
    private String apellidos;
    private Integer estado;
}
