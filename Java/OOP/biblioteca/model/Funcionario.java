package OOP.biblioteca.model;

public class Funcionario {
    private final String nome;
    private final int idade;

    public Funcionario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


    @Override
    public String toString() {
        return "Nome: " + nome  + " | " + idade;
    }
}
