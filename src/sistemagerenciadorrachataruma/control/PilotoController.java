/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.control;

import sistemagerenciadorrachataruma.model.Piloto;
import sistemagerenciadorrachataruma.model.dao.PilotoDAO;

/**
 *
 * @author DELL
 */
public class PilotoController {
    
    private PilotoDAO dao = PilotoDAO.getInstance();
    
    public void cadastrarPiloto(Piloto p) {
        dao.cadastrar(p);
    }
    
    public Piloto buscaPorID(int id) throws IndexOutOfBoundsException {
        Piloto p = dao.buscaPorId(id);
        if(p == null)
            throw new IndexOutOfBoundsException("Piloto == null, possivel ID inexistente.");
        return p;
    }
    
}
