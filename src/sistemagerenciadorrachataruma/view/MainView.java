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
public class MainView implements Runnable {

    private static final MainView instance = new MainView();

    private MainView() {
    }

    public static MainView getInstance() {
        return instance;
    }

    @Override
    public void run() {
        String msg
                = """
                  Escolha uma opcao: 
                  1 - Cadastrar Piloto 
                  2 - Cadastrar Veiculo 
                  3 - Registrar corrida 
                  4 - Visualizar resultados 
                  0 - Sair 
                  """;

        String option = "";

        while (!option.equals("0")) {

            try {
                option = JOptionPane.showInputDialog(null, msg, Setup.title, JOptionPane.QUESTION_MESSAGE);
                if (option == null) {
                    break;
                }

                switch (option) {
                    case "1" ->
                        CadastrarPilotoView.getInstance().run();
                    case "2" ->
                        CadastrarVeiculoView.getInstance().run();
                    case "3" ->
                        CorridaView.getInstance().run();
                    case "4" ->
                        RelatorioView.getInstance().run();
                    case "0" ->
                        JOptionPane.showMessageDialog(null, "Sistema encerrado", Setup.title, JOptionPane.INFORMATION_MESSAGE);
                    default -> {
                        if (option.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Campo vazio. Informe uma opcao.", Setup.title, JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Opcao invalida", Setup.title, JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Erro inesperado.", Setup.title, JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

        }

    }
}
