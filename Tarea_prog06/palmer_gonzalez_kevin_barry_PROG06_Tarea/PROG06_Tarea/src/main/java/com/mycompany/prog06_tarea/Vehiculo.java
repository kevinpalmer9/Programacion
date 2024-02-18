/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog06_tarea;

import java.time.LocalDate;

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
    int km, fechaMatriculacion;
    String descripcion;
    int precio;
    String propietario;
    String dniPropietario;

    //Definicion de metodos
    void set_nuevo(String marca, String matricula, int km, int fechaMatriculacion, String descripcion, int precio, String propietario, String dniPropietario) {

        this.marca = marca;
        this.matricula = matricula;
        this.km = km;
        this.fechaMatriculacion = fechaMatriculacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.propietario = propietario;
        this.dniPropietario = dniPropietario;
    }

    //Devuelve string marca 
    public String get_marca() {
        return marca;
    }

    //Devuelve string matricula 
    public String get_matricula() {
        return matricula;
    }

    //Devuelve int km 
    public int get_km() {
        return km;
    }

    //Recibe un int km, estableciendoselo al atributo de la clase vehiculo.km
    void set_km(int km) {
        this.km = km;
    }

    //Hace la resta de la fecha actual con la fecha de matriculacion, devuelve valor int antiguedad
    public int get_anios() {
        int antiguedad;
        LocalDate ahora1 = LocalDate.now();
        antiguedad = ahora1.getYear() - this.fechaMatriculacion;
        return antiguedad;
    }

    //Devuelve el string con el dni del propietario
    public String get_propietario() {
        return dniPropietario;
    }

    //Devuelve in string con la descripcion
    public String get_desc() {
        return descripcion;
    }

    //Devuelve un int con el precio del vehiculo
    public int get_precio() {
        return precio;
    }
}
