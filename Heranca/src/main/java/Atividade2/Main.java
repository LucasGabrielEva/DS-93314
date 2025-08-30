package Atividade2;

public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("lucas","719 0000-0000","000.000.000-00","21313","26/06/2005");
        Juridica juridica = new Juridica("gabriel","719 0000-0000","2131231233");

        System.out.println(fisica.toString());
        System.out.println(juridica.toString());

    }
}
