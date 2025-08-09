package org.example;
// ARRAY e VETORES
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double media = 0;
        double soma = 0;



        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Escreva a " + (i + 1) + " notas ");
                notas[i] = ler.nextDouble();
            }while (notas[i] < 0 || notas[i] > 10);
            soma += notas[i];
        }
        System.out.println("\n Exiibindo as notas");
        for (double nota : notas) {
            System.out.println("Nota:" + nota);

        }

          media = + soma / notas.length;

        System.out.println("media " + media);


    }
}
