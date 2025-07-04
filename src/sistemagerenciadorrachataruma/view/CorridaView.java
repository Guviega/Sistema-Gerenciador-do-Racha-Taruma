/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

import javax.swing.JOptionPane;
import sistemagerenciadorrachataruma.Setup;
import sistemagerenciadorrachataruma.control.CorridaControlller;
import sistemagerenciadorrachataruma.control.VeiculoController;
import sistemagerenciadorrachataruma.model.Corrida;
import sistemagerenciadorrachataruma.model.Veiculo;

/**
 *
 * @author DELL
 */
public class CorridaView implements Runnable {

    private static final CorridaView instance = new CorridaView();

    private CorridaView() {

    }

    public static CorridaView getInstance() {
        return instance;
    }

    @Override
    public void run() {
        try {
            String msg = "Escolha o primeiro veiculo a correr:\n";
            for (Veiculo v : new VeiculoController().listarVeiculos()) {
                msg += v.getId() + " - " + v.getModelo() + "\n";
            }
            int idVeiculo1 = Integer.parseInt(JOptionPane.showInputDialog(null, msg, Setup.title, JOptionPane.QUESTION_MESSAGE));
            System.out.println(new VeiculoController().buscaVeiculoPorID(idVeiculo1));

            msg = "Escolha o segundo veiculo a correr:\n";
            for (Veiculo v : new VeiculoController().listarVeiculos()) {
                if (v.getId() == idVeiculo1) {
                    continue;
                }
                msg += v.getId() + " - " + v.getModelo() + "\n";
            }
            int idVeiculo2 = Integer.parseInt(JOptionPane.showInputDialog(null, msg, Setup.title, JOptionPane.QUESTION_MESSAGE));
            System.out.println(new VeiculoController().buscaVeiculoPorID(idVeiculo2));

            if (idVeiculo2 == idVeiculo1) {
                throw new IllegalArgumentException("O veiculo nao pode correr com ele mesmo.");
            }

            JOptionPane.showMessageDialog(null,
                    "Hora de registrar os resultados!", Setup.title, JOptionPane.INFORMATION_MESSAGE);

            double tempoV1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Qual o tempo do primeiro veiculo?\nEx.: 07.866", Setup.title, JOptionPane.QUESTION_MESSAGE));
            double velV1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Qual a velocidade do primeiro veiculo?\nEx.: 182.67", Setup.title, JOptionPane.QUESTION_MESSAGE));
            double tempoV2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Qual o tempo do segundo veiculo?\nEx.: 07.866", Setup.title, JOptionPane.QUESTION_MESSAGE));
            double velV2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Qual a velocidade do segundo veiculo?\nEx.: 182.67", Setup.title, JOptionPane.QUESTION_MESSAGE));

            new CorridaControlller().cadastrarCorrida(idVeiculo1, idVeiculo2, tempoV1, tempoV2, velV1, velV2);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,
                    "ERRO: Veiculo inexistente.\nInfo: " + e.getMessage(), Setup.title, JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,
                    "ERRO: Informe os valores corretamente.\nInfo: " + e.getMessage(), Setup.title, JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }
    }

}
