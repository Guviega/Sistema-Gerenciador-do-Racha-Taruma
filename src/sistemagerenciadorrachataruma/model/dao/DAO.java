/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagerenciadorrachataruma.model.dao;

import java.util.List;

/**
 *
 * @author DELL
 */
public interface DAO <T> {
    
    void cadastrar(T t);
    T buscaPorId(int id);
    List listar();
    
}
