/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sistemagerenciadorrachataruma.model.Corrida;

/**
 *
 * @author DELL
 */
public class CorridaDAO implements DAO<Corrida> , IDAutoGenerateable{

    private static final CorridaDAO instance = new CorridaDAO();
    private final Map<Integer, Corrida> corridas = new HashMap<>();
    
    private int nextId = 1;

    private CorridaDAO() {
    }

    public static CorridaDAO getInstance() {
        return instance;
    }

    @Override
    public void cadastrar(Corrida t) {
        corridas.put(t.getId(), t);
    }

    @Override
    public Corrida buscaPorId(int id) {
        return corridas.get(id);
    }

    @Override
    public List<Corrida> listar() {
        return new ArrayList(corridas.values());
    }
    
    public int atribuirId() {
        int id = instance.nextId;
        instance.nextId++;
        return id;
    }

}
