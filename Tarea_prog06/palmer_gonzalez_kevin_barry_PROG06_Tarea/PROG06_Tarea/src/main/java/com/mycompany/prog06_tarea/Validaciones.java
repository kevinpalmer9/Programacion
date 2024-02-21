/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
  System.out.print("/////////////////////////////////////////////////////////////\n");
        System.out.println("Kevin Barry Palmer Gonzalez/a");
        System.out.println("Localidad: Valladolid, Provincia: Valladolid");
        java.util.Date utilDate = new java.util.Date(); //fecha actual directamente
        System.out.println("Fecha: " + utilDate + "\n");
        System.out.println("Programa 5");
        System.out.println("");
        System.out.print("/////////////////////////////////////////////////////////////\n");
 
 */
package com.mycompany.prog06_tarea;

import java.util.regex.*;

/**
 *
 * @author Kevin Palmer Gonzalez
 *
 * En esta clase se realizan todas las validaciones correspondientes Validacion
 * de formato de dni, formatod de matricula y formato de nombre.
 *
 *
 */
public class Validaciones {

    
    //Recibe un string
    //Devuelve un boolean. Si lo encuentra, devuelve true
    static boolean validacionDni(String dni) {
        //Se define el patron
        Pattern p = Pattern.compile("([XY]?)([0-9]{8})([A-Za-z])");
        //Se busca el patron
        Matcher m = p.matcher(dni);
        return m.find();
    }

    //Recibe un string
    //Devuelve un boolean. Si lo encuentra, devuelve true
    static boolean validacionMatricula(String matricula) {
        Pattern p = Pattern.compile("([0-9]{4})([A-Za-z]{3})");
        Matcher m = p.matcher(matricula);
        return m.find();
    }

    //Recibe un string
    //Devuelve un boolean (validacion de longitud & validacion de espacios). 
    //Para devolver afirmativo debe tener menos de 40 caracteres y mas de dos espacio. Nombre y dos apellidos
    static boolean validacionNombre(String nombre) {
        boolean vallong = false, valesp = false;
        int cantidadespacios = 0;
        if (nombre.length() < 40) {
            //El nombre tiene menos de 40 caracteres
            vallong = true;
        }
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == ' ') {
                cantidadespacios++;
            }
        }
        if (cantidadespacios > 1) {
            //Introducir nombre y 2 apellidos
            valesp = true;
        }
        return vallong && valesp;
    }
}
