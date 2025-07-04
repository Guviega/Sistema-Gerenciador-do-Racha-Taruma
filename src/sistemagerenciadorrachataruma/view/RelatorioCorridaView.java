/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

import java.awt.HeadlessException;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import sistemagerenciadorrachataruma.Setup;
import sistemagerenciadorrachataruma.control.CorridaControlller;
import sistemagerenciadorrachataruma.model.Corrida;

/**
 *
 * @author DELL
 */
public class RelatorioCorridaView implements Runnable {

    private static final RelatorioCorridaView instance = new RelatorioCorridaView();

    private RelatorioCorridaView() {

    }

    public static RelatorioCorridaView getInstance() {
        return instance;
    }

    @Override
    public void run() {
        try {
            String msg = "Qual corrida deseja gerar o relatorio?\n";
            for (Corrida c : new CorridaControlller().listarCorridas()) {
                msg+= c.getId() + " - "+c.getVeiculo1().getModelo() +" vs "+c.getVeiculo2().getModelo() +"  "+c.getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))+"\n";
            }
            int idCorrida = Integer.parseInt(JOptionPane.showInputDialog(null, msg, Setup.title, JOptionPane.QUESTION_MESSAGE));
            try {
                CorridaControlller cc = new CorridaControlller();
                cc.salvarRelatorio(cc.buscaCorridaPorId(idCorrida));
                JOptionPane.showMessageDialog(null, 
                        "Relatorio salvo!\n" +new CorridaControlller().geraRelatorio(cc.buscaCorridaPorId(idCorrida)), Setup.title, JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException e) {
            }
        } catch (HeadlessException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

}
