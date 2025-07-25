package Stream;

import java.util.List;

public class App {

    static void somarParesNumeros(List<Integer>numeros){
        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();

        System.out.printf("Soma dos pares das lista é : %d", soma);
    }

    static  void pegarLetrasDosNomes(List<String> nomes){
            nomes.stream()
                    .filter(nome -> nome.startsWith("A"))
                    .map(String::toUpperCase)
                    .sorted()
                    .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer>numeros = List.of(1,2,3,4,5,6,7,8,9,10);
        List<String> nomes = List.of("Jonas", "Felipe", "Rafa", "Leo", "Antonio","Ana");
        pegarLetrasDosNomes(nomes);
        somarParesNumeros(numeros);
    }
}
