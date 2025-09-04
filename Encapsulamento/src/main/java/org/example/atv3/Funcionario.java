package org.example.atv3;

public abstract class Funcionario {
    protected String nome;
    protected String dataNaciento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;

    public Funcionario(String nome, String dataNaciento, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNaciento = dataNaciento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNaciento() {
        return dataNaciento;
    }

    public void setDataNaciento(String dataNaciento) {
        this.dataNaciento = dataNaciento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public abstract double gatSalarioFinal();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNaciento='" + dataNaciento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
