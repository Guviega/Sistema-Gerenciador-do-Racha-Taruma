/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sistemagerenciadorrachataruma.model.Piloto;

/**
 *
 * @author DELL
 */
public class PilotoDAO implements DAO<Piloto>, IDAutoGenerateable{

    private static final PilotoDAO instance = new PilotoDAO();
    private final Map<Integer, Piloto> pilotos = new HashMap<>();
    
    private static int nextId = 1;

    private PilotoDAO() {
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
    public List<Piloto> listar() {
        return new ArrayList(pilotos.values());
    }
    
    /**
     * Atribui um ID auto-gerado e incrementa para o proximo.
     * Semelhante a SEQUENCES em SQL
     * @return 
     */
    @Override
    public int atribuirId() {
        int id = PilotoDAO.nextId;
        PilotoDAO.nextId++;
        return id;
    }

}
