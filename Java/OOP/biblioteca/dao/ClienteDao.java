package OOP.biblioteca.dao;

import OOP.biblioteca.model.Cliente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    private static final String ARQUIVO_JSON = "cliente.json";
    private ObjectMapper mapper;

    public ClienteDao(){
    mapper =  new ObjectMapper();
    }

    public List<Cliente> listarTodos(){
        try{
            File arquivo = new File(ARQUIVO_JSON);
            if(!arquivo.exists()){
                return new ArrayList<>();
            }
            return mapper.readValue(arquivo, new TypeReference<List<Cliente>>() {});
        }catch(IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void salvar(Cliente cliente){
        try{
            List<Cliente>clientes = listarTodos();
            clientes.add(cliente);
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARQUIVO_JSON), clientes);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
