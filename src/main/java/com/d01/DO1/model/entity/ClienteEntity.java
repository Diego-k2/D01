package com.d01.DO1.model.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_clientes")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "cl_name", nullable = false, length = 150)
    private String nome;

    @Column(name = "cl_entryDate", nullable = false)
    private String dataCadastro;

    @OneToOne
    private ContatoEntity contatoEntity;


    public ClienteEntity(String nome, String dataCadastro, ContatoEntity contatoEntity){
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.contatoEntity = contatoEntity;
    }

    public ClienteEntity(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public ContatoEntity getContato() {
        return contatoEntity;
    }

    public void setContato(ContatoEntity contatoEntity) {
        this.contatoEntity = contatoEntity;
    }
}
