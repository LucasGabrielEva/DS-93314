package org.example.atv5;

public abstract class CargoDeConfianca extends Funcionario {
    Bonificacao bonificacao;

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public CargoDeConfianca(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;

    }

}
