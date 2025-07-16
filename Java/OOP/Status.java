package OOP;

public enum Status {
    CONCLUIDO(1),
    PENDENTE(2);

    final int id;

    Status(int id) {
        this.id = id;
    }
}
