package org.example;

import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Arraylist<Double> notas = new Arraylist<>();
        String respota;
        do {
            System.out.println("escreva a nota:");
            notas.add(ler.nextDouble());


        }
    }
}
