package com.mycompany.prog06_tarea;

import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Kevin Palmer Gonzalez
 *
 * Clase que se encarga de realizar la gestion de los vehiculos. En esta clase
 * se insertan nuevos vehiculos (insertarVehiculo), se listaran los vehiculos
 * introducidos con anterioridad (listarVehiculos), se pueden buscar los
 * vehiculos introducidos (buscarVehiculo), tambien se pueden modificar los kms
 * de un vehiculo (modificarKms) Por ultimo hay un metodo para devolver el valor
 * del vehiculo en el array de vehiculos.
 *
 */
public class Concesionario {

    Vehiculo vehiculo[] = new Vehiculo[50];

    int posicion = 0;

    //Metodo para introducir un nuevo vehiculo. Antes se comprueba que el vehiculo no exista antes de introducirlo
    // devuelve un string: CODIGO DE VERIFICACION DE INSERCION DE VEHICULO  // 0 CORRECTO // -1 NO USADO (NO TIENE SENTIDO) // -2 VEHICULO YA EN SISTEMA
    // Recibe informacion del vehiculo a introducir
    String insertarVehiculo(String marca, String matricula, int km, Date fechaMatriculacion,
            String descripcion, int precio, String propietario, String dniPropietario) {
        String codigo = null;

        if (buscarVehiculo(matricula) == (null)) {
            vehiculo[posicion] = new Vehiculo();
            vehiculo[posicion].setNuevo(marca, matricula.toUpperCase(), km, fechaMatriculacion, descripcion, precio, propietario, dniPropietario.toUpperCase());
            posicion = posicion + 1;
            codigo = "0";
        } else {
            codigo = "-2";
        }

        //System.out.println("Posicion " + posicion);
        return codigo;
    }

    //Metodo que muestra por pantalla los vehiculos introducidos en el sistema
    //Recibe un valor de un contador para recorrer el array
    //Devuelve un string con la informacion a mostrar
    String listarVehiculos(int i) {
        //String matricula, marca, descripcion;
        //int precio, km;
        //Desde esta clase no debe mostrar nada
        return ("Marca: " + vehiculo[i].getMarca() + ", Matricula: " + vehiculo[i].getMatricula()
                + ", Precio: " + vehiculo[i].getPrecio() + ", kms : " + vehiculo[i].getKm() + ", Descripcion: "
                + vehiculo[i].getDescripcion() + ".");
    }

    //Metodo que busca un vehiculo introducido en el sistema por medio de la matricula
    //Recibe la matricula a buscar
    //Devuelve el resultado de la busqueda, en caso de encontrar uno devuelve la info, en caso contrario devuelve null
    String buscarVehiculo(String matricula) {
        String resultado = null;
        for (int i = 0; i < posicion; i++) {
            //System.out.println(matricula + " vs " + vehiculo[i].get_matricula());
            if (matricula.equals(vehiculo[i].getMatricula())) {
                //  resultado = ("Marca: " + marca + ", Matricula: " + matricula + ", Precio: " + precio + ", kms : " + km + ", Descripcion: " + descripcion + ".");
                resultado = ("Marca: " + vehiculo[i].getMarca() + ", Matricula: " + vehiculo[i].getMatricula()
                        + ", Precio: " + vehiculo[i].getPrecio() + ", kms : " + vehiculo[i].getKm() + ", Descripcion: "
                        + vehiculo[i].getDescripcion() + ".");
            }
        }
        return resultado;
    }

    //Metodo para aumentar los kms de un vehiculo existente en el sistema.
    //Recibe la matricula y los nuevos kms a introducir
    //Devuelve un valor boolean. Si encuentra el vehiculo (matricula) y los km a escribir son superiores a los actuales devuelve true, en caso contrario false.
    boolean modificarKms(String matricula, int km) {
        boolean coincidencia = false;
        for (int i = 0; i < posicion; i++) {
            if (matricula.equals(vehiculo[i].getMatricula()) & (vehiculo[i].getKm() < km)) {
                coincidencia = true;
                vehiculo[i].setKm(km);
                //System.out.println(matricula + " vs " + vehiculo[i].get_matricula());
            }
        }
        return coincidencia;
    }

    //Metrodo get que devuelve la posicion en la que se encuentra el vehiculo en el listado total de los vehiculos introducidos
    //En otras palabras, devuelve el valor del array en el que se encuentra el vehiculo
    int getPosicion() {
        return posicion;
    }

}
