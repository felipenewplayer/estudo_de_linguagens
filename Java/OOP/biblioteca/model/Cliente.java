package OOP.biblioteca.model;

public class Cliente extends Usuario {
    private int numberAccess;

    public Cliente(String nome, int idade, int senha, int numberAccess) {
        super(nome, idade, senha);
        this.numberAccess = numberAccess;
    }

    public Cliente() {

    }

    public int getNumberAccess() {
        return numberAccess;
    }

    public void setNumberAccess(int numberAccess) {
        this.numberAccess = numberAccess;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()  + " | " + getIdade() + " | Número de acesso: " + numberAccess;
    }
}
