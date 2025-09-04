package org.example.atv3;

public class Main {
    public static void main(String[] args) {
       Direitor direitor = new Direitor("gabriel","30/05/1998",Sexo.MASCULINO,Setor.FINANCEIRO,30000);
        Motoboy motoboy = new Motoboy("lucas", "20/05/1999",Sexo.MASCULINO,Setor.OPERACOES,1500,"121234212");


        System.out.println("motoboy" + motoboy);
        System.out.println("foi contratador");
        System.out.println("Pelo DIreitor" + direitor);

    }
}
