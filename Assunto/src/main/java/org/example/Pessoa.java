package org.example;

public class Pessoa {
     private String nome;
    private  String cpf;



    //get pega e recebe os valores do atributos
    public String getNome() {
        return nome;
    }
    //set defini o valor do atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
