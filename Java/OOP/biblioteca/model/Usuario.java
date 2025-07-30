package OOP.biblioteca.model;

public abstract class Usuario{
    private  String nome;
    private  int idade;
    private  int senha;

    public Usuario(String nome, int idade, int senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getSenha() {
        return senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | " + " Idade: " + idade;
    }
}
