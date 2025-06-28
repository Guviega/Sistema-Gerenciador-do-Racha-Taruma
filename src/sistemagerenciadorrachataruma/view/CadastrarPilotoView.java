/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

import javax.swing.JOptionPane;

/**
 *
 * @author 2024020067
 */
public class CadastrarPilotoView {
    
    private static CadastrarPilotoView instance = new CadastrarPilotoView();
    
    private CadastrarPilotoView() {
        MainView.getInstance();
    }
    
    public static CadastrarPilotoView getInstance() {
        return instance;
    }
    
}
