/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog06_tarea;

import java.util.Scanner;

/**
 *
 * @author Kevin Palmer Gonzalez
 *
 * Clase que muestra la informacion del menu, recibe los datos por teclado e
 * inicializa las clases Solo tiene el metodo main.
 *
 * Se inicializan los valores de concesionario y validaciones
 *
 */
public class Principal {

    public static void main(String[] args) {

        int km, precio, fechaMatriculacion, dia = 0, mes = 0, anio = 0;
        String marca, matricula, descripcion, propietario, dniPropietario;
        String codigoinsercion;
        Scanner leer = new Scanner(System.in);
        Concesionario concesionarioCoches = new Concesionario();
        Validaciones validacion1 = new Validaciones();

        for (int menu = -1; menu != 9;) {
            System.out.println("Las opciones son:");
            System.out.println("1. Nuevo vehiculo");
            System.out.println("2. Listar vehiculos");
            System.out.println("3. Buscar vehiculo:");
            System.out.println("4. Modificar vehiculo:");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            System.out.println("Ha seleccionado:");
            switch (menu) {

                //////////////////////////////////////////////////
                //////            NUEVO VEHICULO           //////
                ////////////////////////////////////////////////// 
                case 1:

                    System.out.println("1. Nuevo vehiculo.");
                    System.out.println("Introduzca los siguientes valores:");
                    //INTRODUCCION DE MARCA
                    System.out.println("Marca:");
                    marca = leer.nextLine();
                    marca = leer.nextLine();
                    //INTRODUCCION DE MATRICULA
                    System.out.println("Matricula:");
                    matricula = leer.nextLine();
                    while ((validacion1.validacionMatricula(matricula) == false)) {
                        System.out.println("Introduzca la matricula correcta:");
                        System.out.println("\tEl formato es NNNNLLL");
                        matricula = leer.nextLine();
                    }
                    //INTRODUCCION DE KMS
                    System.out.println("km:");
                    km = leer.nextInt();
                    //INTRODUCCION DE AÑO DE MATRICULACION
                    System.out.println("Año de matriculacion:");
                    fechaMatriculacion = leer.nextInt();
                    leer.nextLine();
                    //INTRODUCCION DE DESCRIPCION
                    System.out.println("Descripcion:");
                    descripcion = leer.nextLine();
                    //INTRODUCCION DE PRECIO
                    System.out.println("Precio:");
                    precio = leer.nextInt();
                    leer.nextLine();
                    //INTRODUCCION DE NOMBRE DE PROPIETARIO Y VALIDACION
                    System.out.println("Nombre del propietario:");
                    propietario = leer.nextLine();
                    while (validacion1.validacionNombre(propietario) == false) {
                        System.out.println("Debe introducir nombre y apellidos:");
                        propietario = leer.nextLine();
                    }

                    //INTRODUCCION DE DNI Y VALIDACION
                    System.out.println("DNI del propietario:");
                    dniPropietario = leer.nextLine();
                    while (validacion1.validacionDni(dniPropietario) == false) {
                        System.out.println("Debe introducir el DNI adecuadamente:");
                        System.out.println("\tEl formato adecuado es NNNNNNNNL (LNNNNNNNL si es extranjero)");
                        dniPropietario = leer.nextLine();
                    }
                    System.out.println("");

                    // CODIGO DE VERIFICACION DE INSERCION DE VEHICULO 
                    // 0 CORRECTO
                    // -1 NO USADO (NO TIENE SENTIDO)
                    // -2 VEHICULO YA EN SISTEMA
                    codigoinsercion = concesionarioCoches.insertarVehiculo(marca, matricula, km, fechaMatriculacion, descripcion, precio, propietario, dniPropietario);
                    //System.out.println("El codigo recibido es: " + codigoinsercion + "\n");
                    break;

                //////////////////////////////////////////////////
                //////            LISTAR VEHICULO           //////
                ////////////////////////////////////////////////// 
                case 2:

                    System.out.println("Listar vehiculos.");

                    for (int i = 0; i < concesionarioCoches.getPosicion(); i++) {
                        System.out.println("\n" + concesionarioCoches.listarVehiculos(i));
                    }
                    System.out.println("\n");
                    break;

                //////////////////////////////////////////////////
                //////            BUSCAR VEHICULO           //////
                //////////////////////////////////////////////////   
                case 3:
                    System.out.println("Buscar vehiculo.");
                    System.out.println("Introduce la matricula que desea buscar:");
                    matricula = leer.nextLine().toUpperCase();
                    matricula = leer.nextLine().toUpperCase();

                    while ((validacion1.validacionMatricula(matricula) == false)) {
                        System.out.println("Introduzca la matricula correcta:");
                        System.out.println("\tEl formato es NNNNLLL");
                        matricula = leer.nextLine();
                    }

                    if (concesionarioCoches.buscarVehiculo(matricula) == null) {
                        System.out.println("No existe vehiculo con la matricula introducida.");
                    } else {
                        // System.out.println("El vehiculo esta en la posicion: " + coincidencia);
                        System.out.println("" + concesionarioCoches.buscarVehiculo(matricula) + "\n");
                    }

                    break;

                ////////////////////////////////////////////////
                //////            MODIFICAR KMS           //////
                ////////////////////////////////////////////////        
                case 4:
                    System.out.println("4. Modificar kms vehiculo.");

                    //INTRODUCION DE MATRICULA Y VALIDACION
                    System.out.println("Introduce la matricula del vehiculo que desea modificar:");
                    matricula = leer.nextLine();
                    matricula = leer.nextLine();
                    while ((validacion1.validacionMatricula(matricula) == false)) {
                        System.out.println("Introduzca la matricula correcta:");
                        System.out.println("\tEl formato es NNNNLLL");
                        matricula = leer.nextLine();
                    }

                    //INTRODUCCION DE KMS
                    System.out.println("Introduce los kms del vehiculo:");
                    km = leer.nextInt();
                    if (concesionarioCoches.modificarKms(matricula, km) == false) {
                        System.out.println("No existe vehiculo con la matricula introducida.\n");
                    } else {
                        concesionarioCoches.modificarKms(matricula, km);
                        System.out.println("Vehiculo modificado.\n");
                    }
                    break;

                ///////////////////////////////////////
                //////            SALIR          //////
                /////////////////////////////////////// 
                case 5:
                    System.out.println("5. Salir.");
                    menu = 9;
                    break;
                default:

            }

        }

    }
}
