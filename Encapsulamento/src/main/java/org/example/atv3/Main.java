package org.example.atv3;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("lucas", "20/05/1999",Sexo.MASCULINO,Setor.FINANCEIRO,1500,"A");

        System.out.println(motoboy.getCateiraDeHanilitacao());

    }
}
