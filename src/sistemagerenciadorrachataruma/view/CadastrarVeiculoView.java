/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

import javax.swing.JOptionPane;
import sistemagerenciadorrachataruma.Setup;
import sistemagerenciadorrachataruma.control.PilotoController;
import sistemagerenciadorrachataruma.control.VeiculoController;
import sistemagerenciadorrachataruma.model.Piloto;
import sistemagerenciadorrachataruma.model.TipoVeiculo;

/**
 *
 * @author DELL
 */
public class CadastrarVeiculoView implements Runnable {

    private static final CadastrarVeiculoView instance = new CadastrarVeiculoView();

    private CadastrarVeiculoView() {
    }

    public static CadastrarVeiculoView getInstance() {
        return instance;
    }

    @Override
    public void run() {
        int idPiloto = -1;
        int numero = -1;
        int potencia = -1;
        int tipo = -1;
        String modelo;

        try {
            String msg = "Qual o ID do piloto do veiculo?\nID - Nome (CPF)\n\n";
            for (Piloto p : new PilotoController().listarPilotos()) {
                msg += p.getId() + " - " + p.getNome() + " (" + p.getCpf() + ")\n";
            }
            try {
                idPiloto = Integer.parseInt(JOptionPane.showInputDialog(null, msg, Setup.title, JOptionPane.QUESTION_MESSAGE));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Informe o ID correto do piloto.", Setup.title, JOptionPane.ERROR_MESSAGE);
                return;
            }
            msg = "Qual o tipo do veiculo?\n\n";
            TipoVeiculo[] tipos = TipoVeiculo.values();
            for (int i = 0; i < tipos.length; i++) {
                msg += i + " - " + tipos[i].name() + "\n";
            }
            try {
                tipo = Integer.parseInt(JOptionPane.showInputDialog(null, msg, Setup.title, JOptionPane.QUESTION_MESSAGE));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Informe o tipo correto do veiculo.", Setup.title, JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe o numero do veiculo", Setup.title, JOptionPane.QUESTION_MESSAGE));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Informe um valor inteiro para o numero do veiculo.", Setup.title, JOptionPane.ERROR_MESSAGE);
                return;
            }
            modelo = JOptionPane.showInputDialog(null,
                    "Qual o modelo do veiculo?", Setup.title, JOptionPane.QUESTION_MESSAGE);
            try {
                potencia = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe a potencia do veiculo", Setup.title, JOptionPane.QUESTION_MESSAGE));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Informe um valor inteiro para potencia.", Setup.title, JOptionPane.ERROR_MESSAGE);
                return;
            }

            new VeiculoController().cadastrarVeiculo(numero, tipo, potencia, modelo, idPiloto);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
