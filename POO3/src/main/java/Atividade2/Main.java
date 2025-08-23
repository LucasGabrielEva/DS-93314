package Atividade2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(10,3000,"lucas", Setor.FINANCEIRO,Sexo.MASCULINO,30);
        Funcionario funcionario2 = new Funcionario(20, 2000,"gabriel",Setor.MARKETING,Sexo.MASCULINO,20);
        Funcionario funcionario3 = new Funcionario(30, 1500,"julia",Setor.VENDAS,Sexo.FERMININO,19);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
    }
}
