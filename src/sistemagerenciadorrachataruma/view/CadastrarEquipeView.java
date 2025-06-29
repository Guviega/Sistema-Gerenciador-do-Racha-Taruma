/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

/**
 *
 * @author DELL
 */
public class CadastrarEquipeView implements Runnable{

    private static CadastrarEquipeView instance = new CadastrarEquipeView();

    private CadastrarEquipeView() {
        MainView.getInstance();
    }

    public static CadastrarEquipeView getInstance() {
        return instance;
    }

    @Override
    public void run() {
        //TODO
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
