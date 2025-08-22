package Exemplo;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Fazenda grande do retiro", "20","Salvador");
        Cliente cliente1 = new Cliente("lucas",20, endereco1);

        Cliente cliente2 = new Cliente("gabriel", 50,
                new Endereco("Calabetão", "10","Salvador"));

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());




    }
}
