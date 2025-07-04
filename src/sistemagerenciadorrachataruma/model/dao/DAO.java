/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.model.dao;

import java.util.List;

/**
 *
 * @author DELL
 * @param <T> The model class of DAO
 */
public interface DAO <T> {
    
    /**
     * Interface DAO, apresentando todos os metodos que uma classe DAO deve conter, ao menos.
     * @param t 
     */
    void cadastrar(T t);
    T buscaPorId(int id);
    List<T> listar();
    
}
