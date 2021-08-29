/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.consolaventas;

import edu.ujmd.Clases.Usuarios;
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

        int nivel;

        //Declaramos el scanner
        Scanner in = new Scanner(System.in);

        //Realizamos el Login para los usuarios
        System.out.println("Bienvenidos al sistema de ventas Don Diego");

        //Realizamos el menu de acceso    
        System.out.println("Ingrese el nivel de acceso del usuario");
        System.out.println("Nivel 1 ->Administrador");
        System.out.println("Nivel 2 ->Vendedor");
        System.out.println("Nivel 3 ->Invitado");

        nivel = in.nextInt();

        //Creamos la istancia
        Usuarios U = new Usuarios();
        //Nivel de acceso del usuario

        //Realizamos un Switch para identificar los usuarios
        switch (nivel) {
            case 1:

                do {
                    System.out.println("Bienvenido administrador al sistema de ventas Don Jose");

                    System.out.println("Ingrese el usuario ");

                    usuario = in.next();

                    System.out.println("Ingrese la contraseña");

                    cont = in.next();

                } while (U.AccesoConcecidoAdministrador(usuario, cont) == false);

                break;

            case 2:

                do {

                    System.out.println("Bienvenido vendedor al sistema de ventas Don Jose");

                    System.out.println("Ingrese el usuario ");

                    usuario = in.next();

                    System.out.println("Ingrese la contraseña");

                    cont = in.next();

                } while (U.AccesoConcedidoVendedor(usuario, cont) == false);

                break;

            case 3:

                do {

                    System.out.println("Bienvenido invitado al sistema de ventas Don Jose");

                    System.out.println("Ingrese el usuario ");

                    usuario = in.next();

                    System.out.println("Ingrese la contraseña");

                    cont = in.next();

                } while (U.AccesoConcecidoInvitado(usuario, cont) == false);

                break;

        }

        //Realizamos el menu del sistema de ventas
        boolean salir = false;
        int opc;

        //Declaramos el scanner
        Scanner sn = new Scanner(System.in);
        
        do{
            
             System.out.println("Menu de opciones");
            System.out.println("1. Venta nueva");
            System.out.println("2. Consultar inventarios");
            System.out.println("3. Cambiar contraseña");
            System.out.println("4. Salir del programa");

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
            
        }while(opc!=4);
       

    }

}
