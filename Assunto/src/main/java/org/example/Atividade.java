package org.example;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        String nomeUsuario = "lucas";
        String senhaSalva = "123";


       System.out.println("Escreva o nome do usurio");
       String nome = ler.next();
       System.out.println("Escreva a senha");
       String senha = ler.next();

       if (nome.equals(nomeUsuario)  && senha.equals(senhaSalva) ) {
           System.out.println("BEM - VINDO, usuario logado");
       }else {
           System.out.println("Usuario ou senha invalido");
       }
       ler.close();


    }
}
