package org.example.atv3;

public class Motoboy extends Funcionario {
    private String cateiraDeHanilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String cateiraDeHanilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.cateiraDeHanilitacao = cateiraDeHanilitacao;
    }

    public String getCateiraDeHanilitacao() {
        return cateiraDeHanilitacao;
    }

    public void setCateiraDeHanilitacao(String cateiraDeHanilitacao) {
        this.cateiraDeHanilitacao = cateiraDeHanilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "cateiraDeHanilitacao='" + cateiraDeHanilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }

}
