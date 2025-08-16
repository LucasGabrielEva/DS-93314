package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //instanciar uma classe
        Pessoa p1 = new Pessoa("lucas", 20);
        Produto pr = new Produto(12, "Arroz");


        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade:" + p1.getIdade());

        System.out.println();

        System.out.println("produto: " + pr.getNome());
        System.out.print("preco: " + pr.getPrecoUnitario());
    }
}