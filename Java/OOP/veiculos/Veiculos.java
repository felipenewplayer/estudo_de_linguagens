package OOP.veiculos;

import java.time.LocalDate;

public class Veiculos implements Acoes {
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
    @Override
    public void ligar(){
        System.out.println("Ligando carro" + nome);
    }

    @Override
    public String toString() {
        return "Nome: " + nome  +  " | " + "Marca: " + marca + " | " + "Ano: " + ano ;
    }

}
