/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.consolaventas;

import edu.ujmd.Clases.Usuarios;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author meev9
 */
public class ProyectoConsolaVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaramos variables
        String usuario;

        String cont;

        //Realizamos el Login para los usuarios
        System.out.println("Bienvenidos al sistema de ventas Don Diego");

        System.out.println("Ingrese las credenciales");

        Scanner in = new Scanner(System.in);

        //Realizamos el menu de acceso    
        System.out.println("Ingrese el usuario ");

        usuario = in.nextLine();

        System.out.println("Ingrese la contraseña");

        cont = in.nextLine();

        //Realizamos el menu del sistema de ventas
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opc;

        while (!salir) {
            System.out.println("Menu de opciones");
            System.out.println("1. Venta nueva");
            System.out.println("2. Consultar inventarios");
            System.out.println("3. Cambiar contraseña");
            System.out.println("4. Salir del programa");

            try {
                System.out.println("Seleccione la opcion que desee realizar");
                opc = sn.nextInt();

                switch (opc) {
                    case 1:

                        System.out.println("**Menu para realizar nueva venta**");
                        System.out.println("Ingrese la nueva venta que desea realizar:");
                        break;

                    case 2:
                        System.out.println("**Menu para ver la lista de inventarios**");
                        System.out.println("La lista de los inventarios es la siguiente:");
                        System.out.println("Catalogo de productos:");
                        System.out.print("1- huevos\n"
                                + "2- pollo\n"
                                + "3- aceite\n"
                                + "4- fósforos\n"
                                + "5- dulces\n"
                                + "6- margarina\n"
                                + "7- jabón\n"
                                + "8- carne\n"
                                + "9- gaseosa\n"
                                + "10- desechables\n");
                        break;

                    case 3:
                        System.out.println("**Menu para cambiar contraseña**");
                        System.out.println("Seleccione su nueva contraseña:");
                        System.out.println("Escriba nuevamente su contraseña nueva:");
                        break;

                    case 4:
                        System.out.println("Saliendo del programa");
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo numeros entre 1 al 4");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("debes insertar un numero antes");
                sn.next();
            }

        }

    }
}
