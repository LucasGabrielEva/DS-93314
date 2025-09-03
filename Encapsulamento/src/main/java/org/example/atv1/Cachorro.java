package org.example.atv1;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "auau";
    }

    @Override
    public String comer() {
        return "racao";
    }
}
