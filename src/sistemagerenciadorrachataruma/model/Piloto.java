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
public class Piloto implements Participante {

    private int numero;
    private String cpf, nome;
    //private Equipe equipe;

    public Piloto(int numero, String cpf, String nome) {
        this.numero = numero;
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.cpf);
        hash = 67 * hash + Objects.hashCode(this.nome);
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
        final Piloto other = (Piloto) obj;
        return Objects.equals(this.cpf, other.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    */

    @Override
    public int getId() {
        return numero;
    }

    @Override
    public String toString() {
        return "Piloto{" + "numero=" + numero + ", cpf=" + cpf + ", nome=" + nome +/* ", equipe=" + equipe +*/ '}';
    }

}
