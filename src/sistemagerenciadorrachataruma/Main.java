/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagerenciadorrachataruma;

import sistemagerenciadorrachataruma.view.MainView;

/**
 *
 * @author
 */
public class Main {

    /**
     * FUNCIONAMENTO DO SISTEMA: 
     * 
     * 1- CADASTRE AO MENOS 2 PILOTOS 
     * 
     * 2- PARA CADA
     * PILOTO CADASTRE 1 VEICULO 
     * 
     * 3- REALIZE UMA CORRIDA, INFORMANDO, PARA CADA
     * VEICULO O TEMPO DE CORRIDA (201m) E A VELOCIDADE EM QUE CRUZOU A LINHA DE
     * CHEGADA
     * 
     * 4- 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MainView.getInstance().run();
    }

}
