/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

/**
 *
 * @author DELL
 */
public class RelatorioView implements Runnable {
    
    private static final RelatorioView instance = new RelatorioView();
    
    private RelatorioView() {
        
    }
    
    public static RelatorioView getInstance() {
        return instance;
    }

    @Override
    public void run() {
        //TODO
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
