package OOP.conta;

public class Conta {
    private String nome;
    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public double getSaldo(double saldo){
        return  saldo;
    }
}
