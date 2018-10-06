/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.util;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author PLANTA INTERNA
 */
public class ConexBD {
    public DriverManagerDataSource conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/pruebaseratic");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        return dataSource;
    }
    
}
