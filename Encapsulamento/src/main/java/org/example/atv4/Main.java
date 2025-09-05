package org.example.atv4;

public class Main {
    public static void main(String[] args) {
     Gerente gerente  = new Gerente("lucas", "000.000.000-00","05/02/1991",4000,Bonificacao.Direitor);
     Motoboy motoboy = new Motoboy("gabriel","000.000.000-00","26/05/2004",1500,"g254");

        System.out.println("motoboy " + motoboy);
        gerente.admitir(motoboy);
        System.out.println("gerente" + gerente);

    }
}
