package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);



        System.out.println("Cadastro do Pet 1");
        System.out.println("Nome: ");
        String nome1  = ler.next();
        System.out.println("idade: ");
        int idade1 = ler.nextInt();
        System.out.println("Raca: ");
        String raca1 = ler.next();
        System.out.println("Porte: ");
        String porte1 = ler.next();
        System.out.println("Alimentacao: ");
        String alimentacao1 = ler.next();

        Pet pet1 = new Pet(nome1, idade1, raca1,porte1,alimentacao1);

        System.out.println("Cadastro do Pet 2");
        System.out.println("Nome: ");
        String nome2 = ler.next();
        System.out.println("idade: ");
        int idade2 = ler.nextInt();
        System.out.println("Raca: ");
        String raca2 = ler.next();
        System.out.println("Porte: ");
        String porte2 = ler.next();
        System.out.println("Alimentacao: ");
        String alimentacao2 = ler.next();

        Pet pet2 = new Pet(nome2, idade2, raca2,porte2,alimentacao2);



            System.out.println("Nome pet1 " + pet1.getNome());
            System.out.println("Idade   " + pet1.getIdade());
            System.out.println("Raca " + pet1.getRaca());
            System.out.println("Porte " + pet1.getPorte());
            System.out.println("alimentacao " + pet1.getAlimentacao());


            System.out.println("Nome pet2 " + pet2.getNome());
            System.out.println("Idade " + pet2.getIdade());
            System.out.println("Raca " + pet2.getRaca());
            System.out.println("Porte " + pet2.getPorte());
            System.out.println("alimentacao " + pet2.getAlimentacao());







    }
}