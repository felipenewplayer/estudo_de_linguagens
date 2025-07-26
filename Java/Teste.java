
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Teste {
    static void ehPrimo(int numero){
        if(numero <=1){
            System.out.println("Não é primo");
        }else {
            for(int i = 2; i < numero; i ++){
               if(numero % i == 0){
                   System.out.println("Não é primo!");
                   return;
               }
            }
            System.out.println("É primo!");
        }
    }

    static void contaVogal(String nome){
        int contador = 0;
        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);

            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' || c == 'u'){
                contador++;
            }}
        System.out.printf("Número de vogais na palavra: %s, é %d\n", nome, contador);
    }

    static  void somaDosPrimeiroNumeros(int numero){
        int resultado = 0;
        for (int i = 1; i <= numero; i++) {
            resultado += i;
        }
        System.out.printf("Soma dos N primeiros números: %s\n", resultado);
    }

    static  void fatorial(int numero){
        int resultado = 1;
        for(int i  = 1; i <= numero; i ++){
            resultado *= i;
        }
        System.out.printf("Fatorial de %d é %d\n", numero, resultado);
    }
    static  void verificarSeEPalindromo(String nome){
        String nomeReverso = new StringBuilder(nome).reverse().toString();
        if(nomeReverso.equals(nome)){
            System.out.println("É palíndromo");
        }else {
            System.out.println("Não é palíndromo");
        }
    }

    static void quantasVezesApareceApalavra(List<String>nomes){
        Map<String, Long> contagem = nomes.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        contagem.forEach((nome, qtd) ->
                System.out.printf("Nome: %s -> %d vez(es)\n",nome,qtd));
    }

    static void dobrarNumeros(List<Integer>numeros){
        List<Integer> numerosDobrados = numeros
                .stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(numerosDobrados);
    }

    static void filtrarSoPares(List<Integer>numeros){
        List<Integer>numerosFiltrados = numeros
                .stream().
                filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numerosFiltrados);
    }

    static  void maiorMenorEMediaNumero(List<Integer>lista){
        int maior = lista.stream().max(Integer::compare)
                .orElseThrow();

        int menor = lista.stream().min(Integer::compare).orElseThrow();

        int soma = lista.stream().mapToInt(n -> n).sum();
        double media = (double) soma / lista.size();
        System.out.printf("Maior número é: %d\n", maior);
        System.out.printf("Menor número é: %d\n", menor);
        System.out.printf("Media dos número é: %f\n", media);
    }

    static void nomesComF(List<String> nomes){
       List<String> filtrado =  nomes.stream()
               .filter(n -> n.startsWith("F"))
               .map(String::toUpperCase)
               .toList();
        System.out.println(filtrado);
    }

        static void agruparNomesPorTamanho(List<String> nomes){
        Map<Character, List<String>>agrupado = nomes
                .stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.groupingBy(n -> n.charAt(0)));

        agrupado.forEach((letra, lista) ->
                System.out.println(letra + " , "+  lista));
        }

    public static void main(String[] args) {
        int numero = 7;
        String nome = "Felipe";
        List<String>nomes = List.of("Rafa","Felipe", "Felipe", "Marcos");
        List<Integer>numeros = List.of(1,2,3,4,5,6,7,8,9,10);

        ehPrimo(numero);
        contaVogal(nome);
        somaDosPrimeiroNumeros(numero);
        fatorial(numero);
        verificarSeEPalindromo(nome);
        quantasVezesApareceApalavra(nomes);
        dobrarNumeros(numeros);
        filtrarSoPares(numeros);
        maiorMenorEMediaNumero(numeros);
        nomesComF(nomes);
        agruparNomesPorTamanho(nomes);
    }
}



