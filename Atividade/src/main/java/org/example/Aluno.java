package org.example;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         double media = 7;

        System.out.println("Escreva seu nome: ");
        String nome = ler.next();

        System.out.println("Escreva a primaira nota: ");
        Double primeiranota = ler.nextDouble();

        System.out.println("Escreva a segunda nota: ");
        Double segundanota = ler.nextDouble();

        System.out.println("A media do aluno é:" +  primeiranota + segundanota  / 2);











    }
}
