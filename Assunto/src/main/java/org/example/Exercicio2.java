package org.example;

public class Exercicio2 {
    public static void main(String[] args) {
        //declaração de variaveis
        String nomeUsuario = "lucas";
        int senha = 123;

        //comparação de String e inteiros
        boolean resultadoNome = nomeUsuario.equals("lucas");
        boolean resultandoSenha = (senha == 456);

        //exibindo resultados
        System.out.println("O nome do usuario está correto?" + resultadoNome);
        System.out.println("A senha está correta?" + resultandoSenha);
    }
}
