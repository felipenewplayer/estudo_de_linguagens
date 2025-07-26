package OOP.veiculos;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Veiculos carro = new Veiculos("Porche", "Ford", LocalDate.of(2025,01,1));
        carro.ligar();
        System.out.println(carro);

        ContaBancaria ba1 = new ContaBancaria();
        ba1.depositar(10);
        System.out.println(ba1.getSaldo());

        Cachorro rico = new Cachorro();
        rico.comer();
    }
}
