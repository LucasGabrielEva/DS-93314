package org.example.atv5;

public enum Bonificacao {
    GERENTE(1.2),
    DIREITOR(1.4);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
