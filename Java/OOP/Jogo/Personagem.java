package OOP.Jogo;

public class Personagem {
    private String nome;
    private int forca;

    public Personagem() {
    }

    public Personagem(String nome, int forca){
        this.nome = nome;
        this.forca = forca;
    }

    public String getNome(){
        return nome;
    }

    public int getForca(){return forca;}

    public void setForca(int valor){forca += valor;}

    public void descricao(){
        System.out.println("Esse personagem...");
    }

    @Override
    public String toString() {
        return " Nome: " + nome + "|" + "Força: " +  forca;
    }
}
