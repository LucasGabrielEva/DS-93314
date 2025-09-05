package org.example.atv4;

public class Gerente extends CargoDeConfianca implements Contracao {
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("funcionario contratado" + funcionario.nome);

    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("funcionario demitido" + funcionario.nome);

    }

    @Override
    public double salarioFinal() {
        return salarioFinal();
    }
}
