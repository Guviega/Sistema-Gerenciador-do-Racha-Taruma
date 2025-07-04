/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.test;

import sistemagerenciadorrachataruma.model.Piloto;
import sistemagerenciadorrachataruma.model.TipoVeiculo;
import sistemagerenciadorrachataruma.model.Veiculo;
import sistemagerenciadorrachataruma.model.dao.PilotoDAO;
import sistemagerenciadorrachataruma.model.dao.VeiculoDAO;

/**
 *
 * @author DELL
 */
public class PreAllocatedData implements Runnable {

    @Override
    public void run() {
        PilotoDAO pilotoDAO = PilotoDAO.getInstance();
        pilotoDAO.cadastrar(new Piloto(pilotoDAO.atribuirId(), "05173805013", "Gustavo"));
        pilotoDAO.cadastrar(new Piloto(pilotoDAO.atribuirId(), "71037900006", "Dina"));
        pilotoDAO.cadastrar(new Piloto(pilotoDAO.atribuirId(), "97190586091", "Gizele"));
        pilotoDAO.cadastrar(new Piloto(pilotoDAO.atribuirId(), "26036377037", "Antony"));
        pilotoDAO.cadastrar(new Piloto(pilotoDAO.atribuirId(), "31406420085", "Senna"));
        pilotoDAO.cadastrar(new Piloto(pilotoDAO.atribuirId(), "30636050009", "Karen"));
        
        VeiculoDAO veiculoDAO = VeiculoDAO.getInstance();
        veiculoDAO.cadastrar(new Veiculo(10, TipoVeiculo.ASPIRADO, 101, "Gol", pilotoDAO.buscaPorId(1)));
        veiculoDAO.cadastrar(new Veiculo(20, TipoVeiculo.TURBO, 175, "Civic", pilotoDAO.buscaPorId(1)));
        veiculoDAO.cadastrar(new Veiculo(25, TipoVeiculo.ASPIRADO, 140, "Astra", pilotoDAO.buscaPorId(3)));
        veiculoDAO.cadastrar(new Veiculo(46, TipoVeiculo.ASPIRADO, 117, "Civic 95", pilotoDAO.buscaPorId(4)));
        veiculoDAO.cadastrar(new Veiculo(69, TipoVeiculo.ASPIRADO, 86, "Uno", pilotoDAO.buscaPorId(5)));
        veiculoDAO.cadastrar(new Veiculo(98, TipoVeiculo.DIESEL, 280, "Ranger", pilotoDAO.buscaPorId(6)));
        veiculoDAO.cadastrar(new Veiculo(308, TipoVeiculo.ASPIRADO, 140, "Golf", pilotoDAO.buscaPorId(2)));
        veiculoDAO.cadastrar(new Veiculo(144, TipoVeiculo.MOTO, 101, "S1000RR", pilotoDAO.buscaPorId(2)));
    }

}
