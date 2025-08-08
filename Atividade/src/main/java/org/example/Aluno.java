package org.example;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         

        System.out.println("Escreva seu nome: ");
        String nome = ler.next();

        System.out.println("Escreva a primaira nota: ");
        Double primeiranota = ler.nextDouble();

        System.out.println("Escreva a segunda nota: ");
        Double segundanota = ler.nextDouble();

        double media = (primeiranota + segundanota) / 2 ;

        System.out.println("A média do aluno " + nome + " é: " + media);












    }
}

