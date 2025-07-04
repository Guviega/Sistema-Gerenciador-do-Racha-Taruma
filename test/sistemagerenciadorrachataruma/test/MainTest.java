/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.test;

import java.util.ArrayList;
import sistemagerenciadorrachataruma.model.TipoVeiculo;
import sistemagerenciadorrachataruma.model.dao.PilotoDAO;
import sistemagerenciadorrachataruma.view.MainView;

/**
 *
 * @author DELL
 */
public class MainTest {
    
    public static void main(String[] args) {
        new PreAllocatedData().run();
        MainView.getInstance().run();
    }
    
}
