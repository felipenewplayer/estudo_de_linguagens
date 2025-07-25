package Stream;

import java.util.List;
import java.util.Map;

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


    static void agruparAlunosPorNotas(List<Aluno>list){
        Map<Integer, List<Aluno>> alunoPorNota = list.stream().collect(groupingBy(
                Aluno::getNota));
        alunoPorNota.forEach((nota, lista) -> {
            System.out.println(nota + ":");
            lista.forEach(p-> System.out.println(" " + p.getNome()));
        });
    }

    public static void main(String[] args) {
        List<Aluno>alunos = List.of(
                new Aluno("Felipe", 10),
                new Aluno("Rafa", 5),
                new Aluno("Leo", 10 ),
                new Aluno("Luana", 8)
        );

        agruparAlunosPorNotas(alunos);
    }

}

