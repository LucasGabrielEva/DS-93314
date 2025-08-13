package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do {
            System.out.println("Escreva uma nota");
            notas.add(ler.nextDouble());

            System.out.println("Deseja inserir mais uma nota?");
            System.out.println("\nPressone a tecla N para sair.");
            resposta = ler.next();
        } while(!resposta.equalsIgnoreCase("n"));
        System.out.println("\nExibindo as notas:");
        for(double nota:notas);
        System.out.println("Nota:" + notas);
    }
}
