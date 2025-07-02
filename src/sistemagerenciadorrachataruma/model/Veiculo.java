/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.model;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Veiculo implements Participante{
    
    private int numero;
    private TipoVeiculo tipoVeiculo;
    private int potencia;
    private String modelo;
    private Piloto piloto;

    public Veiculo(int numero, TipoVeiculo tipoVeiculo, String modelo, Piloto piloto) {
        this.numero = numero;
        this.tipoVeiculo = tipoVeiculo;
        this.modelo = modelo;
        this.piloto = piloto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.numero;
        hash = 37 * hash + Objects.hashCode(this.tipoVeiculo);
        hash = 37 * hash + Objects.hashCode(this.modelo);
        hash = 37 * hash + Objects.hashCode(this.piloto);
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
        final Veiculo other = (Veiculo) obj;
        return this.numero == other.numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public int getId() {
        return numero;
    }
    
    
    
}
