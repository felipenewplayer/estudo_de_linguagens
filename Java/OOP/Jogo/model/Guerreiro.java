package OOP.Jogo.model;

public class Guerreiro extends Personagem {
    Armamento armamento;

    public Guerreiro(String nome, int forca) {
        super(nome, forca);
    }


    public Armamento getArmamento() {
        return armamento;
    }
    public void setArmamento(Armamento armamento){
        this.armamento = armamento;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "|" + " Força: " + getForca() + " Arma: " + getArmamento();
    }
}
