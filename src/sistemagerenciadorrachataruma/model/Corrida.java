/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.model;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Corrida implements Identificavel{

    private int id;
    private final LocalDateTime dataHora;
    private final Veiculo veiculo1, veiculo2;
    private Veiculo vencedor;
    private double tempoVeiculo1, tempoVeiculo2, velocidadeVeiculo1, velocidadeVeiculo2;

    public Corrida(int id, LocalDateTime dataHora, Veiculo veiculo1, Veiculo veiculo2, Veiculo vencedor, double tempoVeiculo1, double tempoVeiculo2, double velocidadeVeiculo1, double velocidadeVeiculo2) {
        this.id = id;
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

    @Override
    public int getId() {
        return id;
    }

    public void setNumero(int numero) {
        this.id = numero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.dataHora);
        hash = 83 * hash + Objects.hashCode(this.vencedor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Corrida other = (Corrida) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Corrida{" + "numero=" + id + ", dataHora=" + dataHora + ", veiculo1=" + veiculo1 + ", veiculo2=" + veiculo2 + ", vencedor=" + vencedor + ", tempoVeiculo1=" + tempoVeiculo1 + ", tempoVeiculo2=" + tempoVeiculo2 + ", velocidadeVeiculo1=" + velocidadeVeiculo1 + ", velocidadeVeiculo2=" + velocidadeVeiculo2 + '}';
    }

}
