/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

import javax.swing.JOptionPane;
import sistemagerenciadorrachataruma.Setup;
import sistemagerenciadorrachataruma.control.PilotoController;

/**
 *
 * @author 2024020067
 */
public class CadastrarPilotoView implements Runnable {

    private static final CadastrarPilotoView instance = new CadastrarPilotoView();

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
            new PilotoController().cadastrarPiloto(cpf, nome);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,
                    "ERRO nos dados fornecidos:\n" + e.getMessage(), Setup.title, JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

}
