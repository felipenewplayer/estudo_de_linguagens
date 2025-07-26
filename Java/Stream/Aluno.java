package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;


public class Aluno {
    String nome;
    int nota;

    public Aluno(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() { return nome; }
    public int getNota() { return nota; }

    @Override
    public String toString() {
        return nome  + " " +  nota;
    }

    static void agruparAlunosPorNotas(List<Aluno>list){
        Map<Integer, List<Aluno>> alunoPorNota = list.stream().collect(groupingBy(
                Aluno::getNota));
        alunoPorNota.forEach((nota, lista) -> {
            System.out.printf(nota + ":");
            lista.stream().map(Aluno::getNome).forEach(System.out::println);
        });
    }

    static  void nomesQueComecamComL(List<Aluno> list){
        List<String> nomeComL = list.stream()
                .map(Aluno::getNome)
                .filter(n -> n.startsWith("L"))
                .toList();

        System.out.println(nomeComL);
    }
    public static String faixaNota(int nota) {
        if (nota >= 9) return "A (Excelente)";
        else if (nota >= 7) return "B (Bom)";
        else if (nota >= 5) return "C (Regular)";
        else return "D (Insuficiente)";
    }

    static void agruparPorFaixa(List<Aluno>lista){
        Map<String,List<Aluno>>agrupado = lista.stream()
                .collect(Collectors.groupingBy(aluno -> faixaNota(aluno.getNota())));

        agrupado.forEach((faixa , alunosNaFaixa) ->{

                System.out.println("\nFaixa " + faixa + ":");
                alunosNaFaixa
                        .forEach(a -> System.out.println("- " + a.getNome() + " (" + a.getNota() + ")"));
    });
    };

    static void agruparPorPrimeiraLetra(List<Aluno> lista){
        Map<Character, List<Aluno>> agrupado = lista.stream()
                .collect(Collectors.groupingBy(n -> n.getNome().charAt(0)));

        agrupado.forEach((letra, alunos) ->
                System.out.println(letra + " , " + alunos));
    }

    static void alunosAprovados(List<Aluno>lista){
        System.out.println("\nAprovados:");
        lista.stream()
                .filter(a -> a.getNota()>=7)
                .forEach(a -> System.out.println("- " + a.getNome() + " (" +a.getNota() + ")"));
    }

    static void alunosOrdenados(List<Aluno> lista){
        System.out.println("Alunos ordenados por nota:");
        lista.stream().sorted(Comparator.comparing(Aluno::getNota).reversed()
        ).forEach(System.out::println);

    }

    static void tresPrimeirosAlunos(List<Aluno>lista){
        System.out.println("\nAlunos os 3 primeiros sem duplicados: ");
        lista.stream().
                distinct()
                .limit(3).forEach(System.out::println);
    }

    static  void alunosAprovadosOrdenadoPorOrdemAlfabetica(List<Aluno>lista){
        List<String> aprovados = lista.stream()
                 .filter(a -> a.getNota()>=7)
                .map(Aluno::getNome)
                .sorted()
                .toList();

        System.out.println("Aprovados em ordem alfabética");
        aprovados.forEach(System.out::println);
    }

    static void separarAprovadosReprovados(List<Aluno> lista){
        Map<Boolean, List<Aluno>> resultado = lista.stream()
                .collect(Collectors.partitioningBy(aluno -> aluno.getNota()>=7));


        System.out.println("Alunos Aprovado");
        resultado.get(true).forEach(a -> System.out.println(a.getNota() + " - nota: " + a.getNota()));

        System.out.println("Alunos Reprovados");
        resultado.get(false).forEach(a -> System.out.println(a.getNome() + " - nota: " + a.getNota()));
    }

    static String conceito(int nota){
        if(nota >=9) return "A" ;
        else if (nota >=8) return  "B";
        else if (nota >=7) return "C";
        else if (nota >=6) return "D";
        else  return  "E";
    }

    static void agruparPorConceito(List<Aluno> lista){
        Map<String, List<Aluno>> agrupado = lista.stream()
                .collect(Collectors.groupingBy(a -> conceito(a.getNota())));

        System.out.println("Alunos por conceito de notas");
        agrupado.forEach((conceito, alunos) ->
                System.out.println(" (" + conceito + ") " + alunos));
    }

    static void mediaDaGalera(List<Aluno> lista){
        double media = lista.stream().mapToDouble(Aluno::getNota).average().orElseThrow();
        System.out.println("Média da galera é : " + media);
    }

    static void tranformaMap(List<Aluno>lista){
        Map<String, Integer> mapa = lista.stream()
                .collect(Collectors.toMap(
                        Aluno::getNome,
                        Aluno::getNota,
                        (nota1, nota2) -> nota1
                ));

        mapa.forEach((nome, nota) ->
                System.out.println(nome + ", " + nota));
    }
    public static void main(String[] args) {

        List<Aluno>alunos = List.of(
                new Aluno("Felipe", 10),
                new Aluno("Rafa", 5),
                new Aluno("Leo", 10 ),
                new Aluno("Luana", 8),
                new Aluno("Luana", 4)
        );

        agruparAlunosPorNotas(alunos);
        agruparPorFaixa(alunos);
        agruparPorPrimeiraLetra(alunos);
        nomesQueComecamComL(alunos);
        alunosAprovados(alunos);
        alunosOrdenados(alunos);
        tresPrimeirosAlunos(alunos);
        alunosAprovadosOrdenadoPorOrdemAlfabetica(alunos);
        separarAprovadosReprovados(alunos);
        agruparPorConceito(alunos);
        mediaDaGalera(alunos);
        tranformaMap(alunos);
    }
}

