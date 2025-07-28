package OOP.veiculos.model;

import java.time.LocalDate;

public class Carro extends Veiculos{

    public Carro(String nome, String marca, LocalDate ano) {
        super(nome, marca, ano);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o " + getNome());
    }
    @Override
    public void desligar() {
        System.out.println("Desligando o " + getNome());
    }
}

