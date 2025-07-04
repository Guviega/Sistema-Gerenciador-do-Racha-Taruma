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
public class CorridaDAO implements DAO<Corrida> {
    
    private static final CorridaDAO instance = new CorridaDAO();
    private final Map<Integer, Corrida> corridas = new HashMap<>();

    private CorridaDAO() {
    }
    
    public static CorridaDAO getInstance(){
        return instance;
    }

    @Override
    public void cadastrar(Corrida t) {
        corridas.put(t.getNumero(), t);
    }

    @Override
    public Corrida buscaPorId(int id) {
        return corridas.get(id);
    }

    @Override
    public List listar() {
        return new ArrayList(corridas.values());
    }
    
}
