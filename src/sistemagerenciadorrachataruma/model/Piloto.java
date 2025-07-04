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
public class Piloto implements Identificavel {

    /**
     * Atributos: id, cpf, nome
     */
    private final int id;
    private final String cpf;
    private String nome;

    public Piloto(int id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    /**
     * hashCode usando cpf e nome para maior espalhamento
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.cpf);
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    /**
     * Compara o cpf de dois pilotos. Pilotos com mesmo CPF tendem a identificar a mesma pessoa.
     * @param obj
     * @return 
     */
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

    public String getCpf() {
        return cpf;
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Piloto{" + "id=" + id + ", cpf=" + cpf + ", nome=" + nome + '}';
    }

}
