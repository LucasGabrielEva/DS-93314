package Atividade;

public class Memoria extends Produto {
    private String capacidadeMemoria;

    public Memoria(String marca, String modelo, String capacidadeMemoria) {
        super(marca, modelo);
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public String getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(String capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeMemoria='" + capacidadeMemoria + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
