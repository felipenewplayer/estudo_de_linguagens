package OOP.biblioteca.controller;

import OOP.biblioteca.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeUsuarios {
    private final List<Usuario>  usuarios =  new ArrayList<>();

    public void adicionarUsuario(Usuario u){
        usuarios.add(u);
    }

    public Usuario buscarPorNomeESenha(String nome, int senha) {
        for (Usuario u : usuarios) {
            if (u.getNome().equals(nome) && u.getSenha() == senha ) {
                return u;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
