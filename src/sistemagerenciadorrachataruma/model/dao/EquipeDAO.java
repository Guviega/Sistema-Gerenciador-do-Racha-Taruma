/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sistemagerenciadorrachataruma.model.Equipe;

/**
 *
 * @author DELL
 */

/* DEPRECATED


public class EquipeDAO implements DAO<Equipe> {
    
    private static final EquipeDAO instance = new EquipeDAO();
    private final Map<Integer, Equipe> equipes = new HashMap<>();

    private EquipeDAO() {
    }
    
    public static EquipeDAO getInstance(){
        return instance;
    }

    @Override
    public void cadastrar(Equipe t) {
        equipes.put(t.getId(), t);
    }

    @Override
    public Equipe buscaPorId(int id) {
        return equipes.get(id);
    }

    @Override
    public List listar() {
        return new ArrayList(equipes.values());
    }
    
}
*/