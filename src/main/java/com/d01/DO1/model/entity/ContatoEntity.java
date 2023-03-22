package com.d01.DO1.model.entity;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_contatos")
public class ContatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "cl_type", nullable = false, length = 150)
    private String tipo;

    @Column(name = "cl_text", nullable = false)
    private String texto;

    public ContatoEntity(String tipo, String texto){
        this.tipo = tipo;
        this.texto = texto;
    }

    public ContatoEntity(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
