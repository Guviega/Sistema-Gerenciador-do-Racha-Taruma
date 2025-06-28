/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import sistemagerenciadorrachataruma.Setup;

/**
 *
 * @author 2024020067
 */
public class MainView {
    
    private static MainView instance = new MainView();
    
    private MainView() {
        
        String msg = 
                  "Escolha uma opcao: \n"
                + "1 - Cadastrar Veiculo \n"
                + "2 - Cadastrar Equipe \n"
                + "3 - Cadastrar Piloto \n"
                + "4 - Iniciar corrida \n"
                + "5 - Visualizar resultados \n"
                + "0 - Sair \n";
        
        String option = "";
        while(!option.equals("0"))
        option = JOptionPane.showInputDialog(null, msg, Setup.title, JOptionPane.QUESTION_MESSAGE);
        
        switch (option) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                CadastrarPilotoView.getInstance();
                break;
            case "4":
                break;
            case "5":
                break;
            case "0":
                JOptionPane.showMessageDialog(null, "Sistema encerrado", Setup.title, JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static MainView getInstance() {
        return instance;
    }
    
}
