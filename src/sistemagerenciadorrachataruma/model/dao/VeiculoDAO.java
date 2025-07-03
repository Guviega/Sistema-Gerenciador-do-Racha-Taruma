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
import sistemagerenciadorrachataruma.model.Veiculo;

/**
 *
 * @author DELL
 */
public class VeiculoDAO implements DAO<Veiculo> {

    private static final VeiculoDAO instance = new VeiculoDAO();
    private final Map<Integer, Veiculo> veiculos = new HashMap<>();

    public VeiculoDAO() {
    }

    public static VeiculoDAO getInstance() {
        return instance;
    }

    @Override
    public void cadastrar(Veiculo t) {
        veiculos.put(t.getId(), t);
    }

    @Override
    public Veiculo buscaPorId(int id) {
        return veiculos.get(id);
    }

    @Override
    public List listar() {
        return new ArrayList(veiculos.values());
    }

}
