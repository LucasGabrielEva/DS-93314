package org.example;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        //Atribuição de valores
        p1.setNome("lucas");
        p1.setCpf("111.222.333-00");

        p2.setNome("gabriel");
        p2.setCpf("333.444.555-11");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Cpf: " + p1.getCpf());
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Cpf: " + p2.getCpf());
    }
}
