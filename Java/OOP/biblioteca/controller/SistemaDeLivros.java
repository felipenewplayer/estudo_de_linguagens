package OOP.biblioteca.controller;

import OOP.biblioteca.model.Livros;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeLivros {
    private List<Livros> livros = new ArrayList<>();

    public void addLivros(Livros l){
        livros.add(l);
    }

    public List<Livros> getLivros(){
        return livros;
    }
}
