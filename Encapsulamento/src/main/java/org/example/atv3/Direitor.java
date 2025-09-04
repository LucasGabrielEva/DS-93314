package org.example.atv3;

public class Direitor extends Funcionario implements Contratacao{
    private final double PREMIO = 0.2;

    public Direitor(String nome, String dataNaciento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNaciento, sexo, setor, salarioBase);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Fucionario contratado!" + funcionario.nome);

    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionario demitido!" + funcionario.nome);

    }

    @Override
    public double gatSalarioFinal() {
        return super.salarioBase = (super.salarioBase * this.PREMIO);
    }
}
