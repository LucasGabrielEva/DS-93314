package org.example.atv4;

public enum Bonificacao {
    Gerente(1.3),
    Direitor(1.4);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
