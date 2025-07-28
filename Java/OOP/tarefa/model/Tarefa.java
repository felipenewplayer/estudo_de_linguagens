package OOP.tarefa.model;

import java.time.LocalDate;

public class Tarefa {
    String nome;
    LocalDate data;
    Status status;

    public Tarefa(String nome, LocalDate data, Status status) {
        this.nome = nome;
        this.data = data;
        this.status = status;
    }

    public void marcarComoConcluido(){
        this.status = Status.CONCLUIDO;
    }
    public void desmcarcar(){
        this.status = Status.PENDENTE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s | Data: %s | Status : %s
                """, nome, data, status);
    }
}
