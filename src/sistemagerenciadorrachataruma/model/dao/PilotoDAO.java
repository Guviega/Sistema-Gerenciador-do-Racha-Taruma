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
import sistemagerenciadorrachataruma.model.Piloto;

/**
 *
 * @author DELL
 */
public class PilotoDAO implements DAO<Piloto> {

    private static final PilotoDAO instance = new PilotoDAO();
    private final Map<Integer, Piloto> pilotos = new HashMap<>();

    public PilotoDAO() {
    }

    public static PilotoDAO getInstance() {
        return instance;
    }

    @Override
    public void cadastrar(Piloto t) {
        pilotos.put(t.getId(), t);
    }

    @Override
    public Piloto buscaPorId(int id) {
        return pilotos.get(id);
    }

    @Override
    public List listar() {
        return new ArrayList(pilotos.values());
    }

}
