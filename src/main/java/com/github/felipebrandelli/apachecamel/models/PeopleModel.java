package com.github.felipebrandelli.apachecamel.models;

import lombok.Data;

@Data
public class PeopleModel {
    String nome;
    String sobrenome;
    Integer idade;
    String cidade;
    String estado;

    public PeopleModel(String nome, String sobrenome, Integer idade, String cidade, String estado) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cidade = cidade;
        this.estado = estado;
    }
}
