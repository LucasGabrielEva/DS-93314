package Atividade;

public class Veiculo {
    private String placa;
    private String cor;
    private String numdepassageiro;
    private String capdetanque;
    private String velocidademax;
    private String consumomedio;


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumdepassageiro() {
        return numdepassageiro;
    }

    public void setNumdepassageiro(String numdepassageiro) {
        this.numdepassageiro = numdepassageiro;
    }

    public String getCapdetanque() {
        return capdetanque;
    }

    public void setCapdetanque(String capdetanque) {
        this.capdetanque = capdetanque;
    }

    public String getVelocidademax() {
        return velocidademax;
    }

    public void setVelocidademax(String velocidademax) {
        this.velocidademax = velocidademax;
    }

    public String getConsumomedio() {
        return consumomedio;
    }

    public void setConsumomedio(String consumomedio) {
        this.consumomedio = consumomedio;
    }

    public Veiculo(String placa, String cor, String numdepassageiro, String capdetanque, String velocidademax, String consumomedio) {
        this.placa = placa;
        this.cor = cor;
        this.numdepassageiro = numdepassageiro;
        this.capdetanque = capdetanque;
        this.velocidademax = velocidademax;
        this.consumomedio = consumomedio;
    }
}
