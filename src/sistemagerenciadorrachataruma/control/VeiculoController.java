/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.control;

import java.util.List;
import sistemagerenciadorrachataruma.model.TipoVeiculo;
import sistemagerenciadorrachataruma.model.Veiculo;
import sistemagerenciadorrachataruma.model.dao.PilotoDAO;
import sistemagerenciadorrachataruma.model.dao.VeiculoDAO;

/**
 *
 * @author DELL
 */
public class VeiculoController {

    private VeiculoDAO dao = VeiculoDAO.getInstance();

    public void cadastrarVeiculo(int numero, int tipoVeiculo, int potencia, String modelo, int idPiloto) {
        TipoVeiculo[] tipos = TipoVeiculo.values();
        Veiculo v = new Veiculo(numero, tipos[tipoVeiculo], potencia, modelo, PilotoDAO.getInstance().buscaPorId(idPiloto));
        dao.cadastrar(v);
        System.out.println(v);
    }

    public Veiculo buscaVeiculoPorID(int id) {
        Veiculo v = dao.buscaPorId(id);
        if (v == null) {
            throw new IndexOutOfBoundsException("Veiculo == null, possivel ID inexistente.");
        }
        return v;
    }

    public List listarVeiculos() {
        return dao.listar();
    }

}
