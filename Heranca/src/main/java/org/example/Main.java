package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario( "lucas ",20, "3333 ","vendendor ",1500 );
        Cliente cliente1 = new Cliente("gabriel",20,"29/08/2025","dinheiro");

        System.out.println(funcionario1.toString());
        System.out.println(cliente1.toString());
    }

}