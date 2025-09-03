package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();

        System.out.println("O cachorro faz " + cachorro.emitirSom() + " ele come:" + cachorro.comer());
        System.out.println("O gato faz: " + gato.emitirSom() + " ele come: " + gato.comer());
        System.out.println("O pato faz: " + pato.emitirSom() + " ele come: " + pato.comer());
        System.out.println("O galo faz: " + galo.emitirSom() + " ele come: " + galo.comer());



    }



}
