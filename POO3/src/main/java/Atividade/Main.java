package Atividade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Placa ");
        String placa = ler.next();
        System.out.println("cor ");
        String cor  = ler.next();
        System.out.println("numero de pessoas ");
        String numdepassageiro = ler.next();
        System.out.println("Cacidade de tanque ");
        String capdetanque = ler.next();
        System.out.println("velocidade maxima");
        String velocidademax = ler.next();
        System.out.println("Consumo medio ");
        String consumomedio = ler.next();
        System.out.println();
        System.out.println("Titulo ");
        String titulo = ler.next();
        System.out.println();
        System.out.println("Autor ");
        String autor  = ler.next();
        System.out.println("ISBN ");
        String ISBN = ler.next();
        System.out.println();
        System.out.println("Quantidade de paginas ");
        int numerodepaginas = ler.nextInt();
        System.out.println("preco ");
        double preco = ler.nextDouble();

        Veiculo v1 = new Veiculo(placa,cor,numdepassageiro,capdetanque,velocidademax,consumomedio);
        Livro l1 = new Livro(titulo,autor,numerodepaginas,preco, ISBN);

        System.out.println("Placa " + v1.getPlaca());
        System.out.println("cor " + v1.getCor());
        System.out.println("numero de passsageiro " + v1.getNumdepassageiro());
        System.out.println("capaciade de tanque " + v1.getCapdetanque());
        System.out.println("velocidade maxima " + v1.getVelocidademax());
        System.out.println("consumomedio " + v1.getConsumomedio());
        System.out.println();
        System.out.println("titulo " + l1.getTitulo());
        System.out.println("autor " + l1.getAutor());
        System.out.println("ISBN " + l1.getISBN());
        System.out.println("numero de paginas " + l1.getNumerodepaginas());
        System.out.println("precp " + l1.getPreco());















    }
}
