package org.example.atv1;

public class Pato implements Animal {
    @Override
    public String emitirSom() {
        return "quaqua";
    }

    @Override
    public String comer() {
        return "milho";
    }
}
