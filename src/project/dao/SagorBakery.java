/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mnselim
 */
public interface SagorBakery <T>{
    public ArrayList<T> getAll() throws SQLException;
    public boolean save(T value) throws SQLException;
    public boolean update(T value) throws SQLException;
    public boolean delete(T value) throws SQLException;
    public T find(int id) throws SQLException;
    
}
