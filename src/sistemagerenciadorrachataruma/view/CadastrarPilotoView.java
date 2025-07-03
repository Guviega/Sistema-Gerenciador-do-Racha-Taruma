/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

import javax.swing.JOptionPane;
import sistemagerenciadorrachataruma.Setup;
import sistemagerenciadorrachataruma.Util;

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
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Qual o numero do piloto?", Setup.title, JOptionPane.QUESTION_MESSAGE));
            String nome = JOptionPane.showInputDialog(null,
                    "Qual o nome do piloto?", Setup.title, JOptionPane.QUESTION_MESSAGE);
            String cpf = JOptionPane.showInputDialog(null,
                    "Qual o CPF do piloto?", Setup.title, JOptionPane.QUESTION_MESSAGE);
            if (!Util.validaCPF(cpf)) {
                JOptionPane.showMessageDialog(null,
                        "ERRO: O CPF informado eh invalido..", Setup.title, JOptionPane.ERROR_MESSAGE);
                return;
            }
            int equipe = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Qual o numero da equipe do piloto?", Setup.title, JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "ERRO: O numero de uma equipe deve ser um numero inteiro.", Setup.title, JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

}
