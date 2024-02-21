/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog06_tarea;

import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.Temporal;

/**
 *
 * @author kevpa
 *
 * Clase en la que se declaran los atributos de vehiculo. En ella tqambien
 * tenemos los metodos, establecer un nuevo vehiculo (set_nuevo), devolver marca
 * (get_marca) devolver matricula (get_matricula), devolver kms (get_kms),
 * establecer kms (set_km), devolver años de antiguedad (get_anios), devolver
 * propietario (get_propietario), devolver descripcion del vehiculo (get_desc),
 * devolver precio del vehiculo (get_precio)
 */
public class Vehiculo {

    //Declaracion de atributos
    String marca;
    String matricula;
    int km;
    Date fechaMatriculacion;
    String descripcion;
    int precio;
    String propietario;
    String dniPropietario;

    void setNuevo(String marca, String matricula, int km, java.util.Date fechaMatriculacion, String descripcion, int precio, String propietario, String dniPropietario) {

        this.marca = marca;
        this.matricula = matricula;
        this.km = km;
        this.fechaMatriculacion = fechaMatriculacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.propietario = propietario;
        this.dniPropietario = dniPropietario;
    }
    
    public String getMarca() {
        return marca;
    }
    public String getMatricula() {
        return matricula;
    }
    public int getKm() {
        return km;
    }
    public Date getFechaMatriculacion(){
        return fechaMatriculacion;
    }
    public String getDescripcion (){
        return descripcion;
    }
     public int getPrecio() {
        return precio;
    }
    public String getPropietario(){
        return propietario;
    }
    public String getDniPropietario(){
        return dniPropietario;
    }    
    private void setMarca (String Marca)
    {
        this.marca=marca;
    }
    private void setMatricula(String Matricula){
        this.matricula = matricula;
    }
     void setKm(int km) {
        this.km = km;
    }
    private void setFechaMatriculacion (Date fechaMatriculacion){
        this.fechaMatriculacion = fechaMatriculacion;
    }
    private void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
    private void setPrecio (int precio){
        this.precio = precio;
    }
    private void setPropietario (String propietario){
        this.propietario = propietario;
    }
    private void setDniPropietario (String dniPropietario){
        this.dniPropietario = dniPropietario;
    }
    
   
    //Hace la resta de la fecha actual con la fecha de matriculacion, devuelve valor int antiguedad
    public Duration getAnios() {
        LocalDate ahora1 = LocalDate.now();
        Duration antiguedad = Duration.between(ahora1, (Temporal) getFechaMatriculacion());
        return antiguedad;
    }


    
    
}
