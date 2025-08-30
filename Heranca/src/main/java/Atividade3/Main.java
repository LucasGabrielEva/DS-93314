package Atividade3;

public class Main {
    public static void main(String[] args) {

        Endereco endEng = new Endereco("graca", "40", "pertodaufba", "00000-000", "salvador");
        Endereco endMed = new Endereco("barra",  "33", "pertodofarol", "00000-000", "salvador");

        Engenheiro engenheiro = new Engenheiro("kakkkk","laslasl",5000,endEng,"123");
        Medico medico =new Medico("adsas","asasas",1000,endMed,"1234");


        System.out.println(engenheiro.toString());
        System.out.println(medico.toString());



    }
}
