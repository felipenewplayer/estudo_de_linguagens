package OOP.veiculos.model;

import java.time.LocalDate;

public  class Moto extends Veiculos{
    public Moto(String nome, String marca, LocalDate ano) {
        super(nome, marca, ano);
    }

    @Override
    public void ligar() {
        System.out.println("Lihando motoca a " + getNome());
    }

    @Override
    public void desligar() {
        System.out.println("Desligando motoca " + getNome());
    }
}
