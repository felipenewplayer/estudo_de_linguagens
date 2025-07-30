package OOP.biblioteca.model;

public class Funcionario extends Usuario {

    public Funcionario(String nome, int idade, int senha) {
        super(nome, idade, senha);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()  + " | " + getIdade();
    }
}
