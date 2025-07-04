/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.view;

import sistemagerenciadorrachataruma.model.Corrida;

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
