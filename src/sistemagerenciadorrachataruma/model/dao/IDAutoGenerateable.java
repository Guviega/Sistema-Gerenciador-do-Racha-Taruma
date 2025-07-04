/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemagerenciadorrachataruma.model.dao;

/**
 *
 * @author DELL
 */
public interface IDAutoGenerateable {
    
    /**
     * Interface que implementa os atributos e metodos necessarios para uma classe que tenha um ID auto-gerado.
     */
    int nextId = 1;
    int atribuirId();
    
}
