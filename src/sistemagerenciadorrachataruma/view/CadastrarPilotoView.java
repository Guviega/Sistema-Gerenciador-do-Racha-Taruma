/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

import javax.swing.JOptionPane;
import sistemagerenciadorrachataruma.Setup;
import sistemagerenciadorrachataruma.Util;
import sistemagerenciadorrachataruma.control.PilotoController;
import sistemagerenciadorrachataruma.model.Piloto;

/**
 *
 * @author 2024020067
 */
public class CadastrarPilotoView implements Runnable {

    private static final CadastrarPilotoView instance = new CadastrarPilotoView();
    PilotoController controller = new PilotoController();

    private CadastrarPilotoView() {
    }

    public static CadastrarPilotoView getInstance() {
        return instance;
    }

    @Override
    public void run() {
        try {
            String nome = JOptionPane.showInputDialog(null,
                    "Qual o nome do piloto?", Setup.title, JOptionPane.QUESTION_MESSAGE);
            String cpf = JOptionPane.showInputDialog(null,
                    "Qual o CPF do piloto?", Setup.title, JOptionPane.QUESTION_MESSAGE).replaceAll("[^\\d]", "");
            Piloto p = new Piloto(controller.atribuirId(), cpf, nome);
            controller.cadastrarPiloto(p);
            System.out.println(p);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,
                    "ERRO nos dados fornecidos:\n" + e.getMessage(), Setup.title, JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

}
