package org.example.atv5;

public class Main {
    public static void main(String[] args) {
        Direitor direitor = new Direitor("Lucas ","000.000.000.-00 ","50000 ",Sexo.MASCULINO,6000,"05/05/2000 ","05/09/2025 ",Bonificacao.DIREITOR);
        Gerente gerente = new Gerente ("Gabriel ","000.000.000.-00 ","00000 ",Sexo.MASCULINO,5000,"05/06/2005 ","05/09/2025 ",Bonificacao.GERENTE);
        MotoBoy motoboy = new MotoBoy("Bruna","000.000.000-00","0000000",Sexo.FEMININO,1500,"06/08/2004","05/09/2025","121323");

        System.out.println(direitor.toString());
        System.out.println(gerente.toString());
        System.out.println(motoboy.toString());
    }
}
