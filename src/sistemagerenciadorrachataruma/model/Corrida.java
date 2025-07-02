/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.model;

import java.time.LocalDateTime;

/**
 *
 * @author DELL
 */
public class Corrida {
    
    private int numero;
    private LocalDateTime dataHora;
    private Veiculo veiculo1, veiculo2, vencedor;
    private double tempoVeiculo1, tempoVeiculo2, velocidadeVeiculo1, velocidadeVeiculo2;

    public Corrida(LocalDateTime dataHora, Veiculo veiculo1) {
        this.dataHora = dataHora;
        this.veiculo1 = veiculo1;
    }
    
    public Corrida(LocalDateTime dataHora, Veiculo veiculo1, Veiculo veiculo2, Veiculo vencedor, double tempoVeiculo1, double tempoVeiculo2, double velocidadeVeiculo1, double velocidadeVeiculo2) {
        this.dataHora = dataHora;
        this.veiculo1 = veiculo1;
        this.veiculo2 = veiculo2;
        this.vencedor = vencedor;
        this.tempoVeiculo1 = tempoVeiculo1;
        this.tempoVeiculo2 = tempoVeiculo2;
        this.velocidadeVeiculo1 = velocidadeVeiculo1;
        this.velocidadeVeiculo2 = velocidadeVeiculo2;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Veiculo getVeiculo1() {
        return veiculo1;
    }

    public Veiculo getVeiculo2() {
        return veiculo2;
    }

    public Veiculo getVencedor() {
        return vencedor;
    }

    public double getTempoVeiculo1() {
        return tempoVeiculo1;
    }

    public double getTempoVeiculo2() {
        return tempoVeiculo2;
    }

    public double getVelocidadeVeiculo1() {
        return velocidadeVeiculo1;
    }

    public double getVelocidadeVeiculo2() {
        return velocidadeVeiculo2;
    }

    public void setVencedor(Veiculo vencedor) {
        this.vencedor = vencedor;
    }

    public void setTempoVeiculo1(double tempoVeiculo1) {
        this.tempoVeiculo1 = tempoVeiculo1;
    }

    public void setTempoVeiculo2(double tempoVeiculo2) {
        this.tempoVeiculo2 = tempoVeiculo2;
    }

    public void setVelocidadeVeiculo1(double velocidadeVeiculo1) {
        this.velocidadeVeiculo1 = velocidadeVeiculo1;
    }

    public void setVelocidadeVeiculo2(double velocidadeVeiculo2) {
        this.velocidadeVeiculo2 = velocidadeVeiculo2;
    }
    
}
