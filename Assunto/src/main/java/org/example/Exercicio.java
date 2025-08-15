package org.example;

public class Exercicio {
    public static void main(String[] args) {
        String nome = "Lucas";
        String sobrenome = "Silveira";

        //exibindo a quantidade de caracteres
        System.out.println("tamanho do nome:" + nome.length());
        System.out.println("tamanho do sobrenome:" + sobrenome.length());

      // concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        //exibindo nome completo usando metodos String - Maiusculos
        System.out.println("concatenação Maiúscula " + nomeCompleto.toUpperCase());

        //exibindo nome completo usando metodos Stringd - minusculas
        System.out.println("concatenação Minúscula " + nomeCompleto.toLowerCase());
    }
}
