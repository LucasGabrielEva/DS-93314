package org.example.atv5;

public class Gerente extends CargoDeConfianca{
    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return this.salarioBase * Bonificacao.GERENTE.getValor();
    }
}
