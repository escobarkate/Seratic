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
public class Prueba {

    private int id;
    private int idAspirante;
    private String nombreA;
    private String carrera;
    private int idEvaluador;
    private String nombreE;
    private String detalle;
    private String evaluacion;
    private String fecha;

    public Prueba() {
    }

    public Prueba(int id, int idAspirante, String nombreA, String carrera, int idEvaluador, String nombreE, String detalle, String evaluacion, String fecha) {
        this.id = id;
        this.idAspirante = idAspirante;
        this.nombreA = nombreA;
        this.carrera = carrera;
        this.idEvaluador = idEvaluador;
        this.nombreE = nombreE;
        this.detalle = detalle;
        this.evaluacion = evaluacion;
        this.fecha = fecha;
    }

    public Prueba(int id, int idAspirante, String carrera, int idEvaluador, String nombreE, String detalle, String evaluacion) {
        this.id = id;
        this.idAspirante = idAspirante;
        this.carrera = carrera;
        this.idEvaluador = idEvaluador;
        this.nombreE = nombreE;
        this.detalle = detalle;
        this.evaluacion = evaluacion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAspirante() {
        return idAspirante;
    }

    public void setIdAspirante(int idAspirante) {
        this.idAspirante = idAspirante;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getIdEvaluador() {
        return idEvaluador;
    }

    public void setIdEvaluador(int idEvaluador) {
        this.idEvaluador = idEvaluador;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
