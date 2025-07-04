/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistemagerenciadorrachataruma.Setup;
import sistemagerenciadorrachataruma.Util;
import sistemagerenciadorrachataruma.model.Piloto;
import sistemagerenciadorrachataruma.model.dao.PilotoDAO;

/**
 *
 * @author DELL
 */
public class PilotoController {

    private PilotoDAO dao = PilotoDAO.getInstance();

    public void cadastrarPiloto(Piloto p) {
        if (!Util.validaCPF(p.getCpf())) {
            throw new IllegalArgumentException("CPF Invalido.");
        } else {
            dao.cadastrar(p);
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
