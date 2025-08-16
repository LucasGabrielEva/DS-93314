package org.example.atividade;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o titulo do livor: ");
        String titulo = ler.next();
        System.out.println();
        System.out.println("Escreva o autor:");
        String autor = ler.next();
        System.out.println();
        System.out.println("paginas");
        int paginas = ler.nextInt();
        System.out.println();
        System.out.println("valor do livro: ");
        double preco = ler.nextDouble();

        Livro l1 = new Livro(titulo,autor,paginas,preco);

        System.out.println("titulo: " + l1.getTitulo() );
        System.out.println("autor: " + l1.getAutor());
        System.out.println("paginas: " + l1.getPaginas());
        System.out.println("preco: " + l1.getPreco());

    }
}
