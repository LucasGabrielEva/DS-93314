package Atividade;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("asasa","kdkdk","21");
        Memoria memoria1 = new Memoria("asas","llll","16g");
        Placamae placamae1 = new Placamae("asqsqwq","pppp","qsqs");
        Dispositivodearmazenamento dispositivodearmazenamento1 = new Dispositivodearmazenamento("oaosoas","mmmmm","32gb","usb");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
        System.out.println(placamae1.toString());
        System.out.println(dispositivodearmazenamento1.toString());

    }
}
