/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.control;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import sistemagerenciadorrachataruma.model.Corrida;
import sistemagerenciadorrachataruma.model.Piloto;
import sistemagerenciadorrachataruma.model.Veiculo;
import sistemagerenciadorrachataruma.model.dao.CorridaDAO;
import sistemagerenciadorrachataruma.model.dao.PilotoDAO;
import sistemagerenciadorrachataruma.model.dao.VeiculoDAO;

/**
 *
 * @author DELL
 */
public class CorridaControlller {

    CorridaDAO dao = CorridaDAO.getInstance();

    public void cadastrarCorrida(int idVeiculo1, int idVeiculo2, double tempoV1, double tempoV2, double velV1, double velV2) {
        int idVencedor;
        idVencedor =  tempoV1 > tempoV2 ? idVeiculo2 : 
                tempoV2 > tempoV1 ? idVeiculo1 :
                velV1 > velV2 ? idVeiculo1 : idVeiculo2;
        
        Corrida c = new Corrida(
                dao.atribuirId(),
                LocalDateTime.now(),
                VeiculoDAO.getInstance().buscaPorId(idVeiculo1),
                VeiculoDAO.getInstance().buscaPorId(idVeiculo2),
                VeiculoDAO.getInstance().buscaPorId(idVencedor),
                tempoV1, tempoV2, velV1, velV2);
        dao.cadastrar(c);
    }

    public Corrida buscaCorridaPorId(int id) {
        Corrida c = dao.buscaPorId(id);
        if (c == null) {
            throw new IndexOutOfBoundsException("Corrida == null, possivel ID inexistente.");
        }
        return c;
    }

    public List listar() {
        return dao.listar();
    }
}
