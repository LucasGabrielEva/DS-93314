package org.example;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        String nome = "mamão com acucar";
        String produto = "televisão";
        double preco = 200;
        int parc = 5;



        System.out.println("loja " + nome);
        System.out.println("produto " + produto);
        System.out.println("preco do produto " +preco);

        System.out.println("com a parcela de 5 vezes fica R$:" + preco / parc);

    }
}
