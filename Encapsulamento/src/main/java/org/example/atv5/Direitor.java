package org.example.atv5;

public class Direitor extends CargoDeConfianca implements Contracao {
    private final double premio = 0.1;

    public Direitor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public double getSalarioFinal() {
        return  (super.salarioBase * super.bonificacao.getValor()) * this.premio;
    }
}
