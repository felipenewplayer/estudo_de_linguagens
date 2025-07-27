package OOP.Jogo;

public class Mago extends Personagem{
    private final int inteligencia;
    public Mago(String nome, int forca, int inteligencia) {
        super(nome, forca);
        this.inteligencia = inteligencia;
    }

    public  int getInteligencia(){
        return inteligencia;
    }



}
