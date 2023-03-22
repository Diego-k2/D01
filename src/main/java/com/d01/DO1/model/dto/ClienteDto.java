package com.d01.DO1.model.dto;

import com.d01.DO1.model.entity.ContatoEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClienteDto {


    @NotBlank(message = "O nome é obrigatório.")
    @Size(max = 150)
    private String nome;

    private String dataCadastro;

    private ContatoEntity contatoEntity;

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

    public ContatoEntity getContatoEntity() {
        return contatoEntity;
    }

    public void setContatoEntity(ContatoEntity contatoEntity) {
        this.contatoEntity = contatoEntity;
    }

    //TODO: IMPLEMENT PARSE TO CLIENTEENTITY
}
