/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seratic.prueba.modelos;

/**
 *
 * @author PLANTA INTERNA
 */
public class Aspirante {
    private int id;
    private String nombre;
    private String carrera;
    private int telefono;
    private String correo;

    public Aspirante(int id, String nombre, String carrera, int telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Aspirante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
