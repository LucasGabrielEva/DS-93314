package org.example.atv2;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(soma.calcular(2, 4));
        System.out.println(subtracao.calcular(2, 4));
        System.out.println(multiplicacao.calcular(2, 4));
        System.out.println(divisao.calcular(2,4));
    }
}
