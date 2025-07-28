package OOP.veiculos.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Veiculos {
    String nome;
    String marca;
    LocalDate ano;

    public Veiculos(String nome, String marca, LocalDate ano){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public abstract void ligar();
    public abstract void desligar();

    @Override
    public String toString() {
        return "Nome: " + nome  +  " | " + "Marca: " + marca + " | " + "Ano: " + ano.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) ;
    }
}
