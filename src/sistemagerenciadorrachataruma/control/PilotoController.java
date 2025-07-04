/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.control;

import java.util.List;
import sistemagerenciadorrachataruma.Util;
import sistemagerenciadorrachataruma.model.Piloto;
import sistemagerenciadorrachataruma.model.dao.PilotoDAO;

/**
 *
 * @author DELL
 */
public class PilotoController {

    /**
     * DAO de Piloto, com instancia unica conforme padrao Singleton
     */
    private final PilotoDAO dao = PilotoDAO.getInstance();

    public void cadastrarPiloto(String cpf, String nome) {
        Piloto p = new Piloto(dao.atribuirId(), cpf, nome);
        if (!Util.validaCPF(p.getCpf())) {
            throw new IllegalArgumentException("CPF Invalido.");
        } else {
            dao.cadastrar(p);
            System.out.println(p);
        }
    }

    public Piloto buscaPilotoPorID(int id) {
        Piloto p = dao.buscaPorId(id);
        if (p == null) {
            throw new IndexOutOfBoundsException("Piloto == null, possivel ID inexistente.");
        }
        return p;
    }

    public List<Piloto> listarPilotos() {
        return dao.listar();
    }

    public int atribuirId() {
        return dao.atribuirId();
    }
}
