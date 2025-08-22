package Atividade1;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("bobi", 5, "labrador");
        Cliente cliente1 = new Cliente("lucas", 20,pet1);
        Cliente cliente2 = new Cliente("gabriel", 30,
                new Pet("tutituti", 5, "labrador"));

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

    }
}
