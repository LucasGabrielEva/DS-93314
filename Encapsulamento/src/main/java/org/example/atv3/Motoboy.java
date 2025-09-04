package org.example.atv3;

public class Motoboy extends Funcionario{
    @Override
    public String toString() {
        return "Motoboy{" +
                "cateiraDeHanilitacao='" + cateiraDeHanilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNaciento='" + dataNaciento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }

    private String cateiraDeHanilitacao;

    public Motoboy(String nome, String dataNaciento, Sexo sexo, Setor setor, double salarioBase, String cateiraDeHanilitacao) {
        super(nome, dataNaciento, sexo, setor, salarioBase);
        this.cateiraDeHanilitacao = cateiraDeHanilitacao;
    }

    public String getCateiraDeHanilitacao() {
        return cateiraDeHanilitacao;
    }

    public void setCateiraDeHanilitacao(String cateiraDeHanilitacao) {
        this.cateiraDeHanilitacao = cateiraDeHanilitacao;
    }

    @Override
    public double gatSalarioFinal() {
        return salarioBase;
    }
}
