/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.consolaventas;

import edu.ujmd.Archivos.Archivos;
import edu.ujmd.Clases.Productos;
import edu.ujmd.Clases.Usuarios;
import java.time.LocalDateTime;
import java.time.Month;
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
        //Creamos la isntancia de escribir y leer archivo

        Archivos a = new Archivos();

        //Realizamos un Switch para identificar los usuarios
        switch (nivel) {

            //Login del administrador
            case 1:

                do {
                    System.out.println("Bienvenido administrador al sistema de ventas Don Jose");

                    System.out.println("Ingrese el usuario ");

                    usuario = in.next();

                    System.out.println("Ingrese la contraseña");

                    cont = in.next();

                } while (U.AccesoConcecidoAdministrador(usuario, cont) == false);
                LocalDateTime localDate = LocalDateTime.now();
                int hora = localDate.getHour();
                int minuto = localDate.getMinute();
                int segundo = localDate.getSecond();

                int dia = localDate.getDayOfMonth();
                int mes = localDate.getMonthValue();
                int anio = localDate.getYear();

                a.EscribirFichero("\nAdministrador", "\nHora:", hora, minuto, segundo, "\nFecha:", dia, mes, anio);

                boolean salir = false;
                int opc;
                do {

                    System.out.println("Digite la opcion a solicitar");
                    System.out.println("1-Venta nueva");
                    System.out.println("2-Consultar inventario");
                    System.out.println("3-Cambiar contraseña");
                    System.out.println("4-Salir del programa");
                    System.out.println("Digite la opcion");
                    opc = in.nextInt();
                    switch (opc) {

                        case 1:

                            System.out.println("**Menu para realizar nueva venta**");
                            System.out.println("Ingrese la nueva venta que desea realizar:");
                            System.out.println("-----------------------------------------");
                            a.LeerFichero();
                            System.out.println("-----------------------------------------");

                            int compra;
                            int productos;
                            int cod[] = new int[9];
                            int cantidad[] = new int[9];

                            System.out.println("Cuantos productos deseea:");
                            productos = in.nextInt();
                            for (int i = 0; i < productos; i++) {

                                System.out.println("Digite el codigo de producto:");
                                cod[i] = in.nextInt();
                                System.out.println("Digite la cantidad de productos:");
                                cantidad[i] = in.nextInt();
                                System.out.println("Codigo/Producto");
                                System.out.println(cod[i] + "," + cantidad[i]);

                            }

                            break;

                        case 2:
                            System.out.println("**Menu para ver la lista de inventarios**");
                            System.out.println("La lista de los inventarios es la siguiente:");
                            a.LeerFichero();
                            break;

                        case 3:
                            System.out.println("**Menu para cambiar contraseña**");
                            System.out.println("Seleccione su nueva contraseña:");
                            System.out.println("Escriba nuevamente su contraseña nueva:");
                            break;

                        case 4:
                            System.out.println("Saliendo del programa");
                            a.EscribirFichero("\nSalida del Administrador", "\nHora:", hora, minuto, segundo, "\nFecha:", dia, mes, anio);
                            salir = true;
                            break;

                        default:
                            System.out.println("Solo numeros entre 1 al 4");
                            break;

                    }

                } while (opc != 4);

                break;
            //Login del vendedor
            case 2:

                do {

                    System.out.println("Bienvenido vendedor al sistema de ventas Don Jose");

                    System.out.println("Ingrese el usuario ");

                    usuario = in.next();

                    System.out.println("Ingrese la contraseña");

                    cont = in.next();

                } while (U.AccesoConcedidoVendedor(usuario, cont) == false);

                LocalDateTime localDate2 = LocalDateTime.now();
                int hora2 = localDate2.getHour();
                int minuto2 = localDate2.getMinute();
                int segundo2 = localDate2.getSecond();

                int dia2 = localDate2.getDayOfMonth();
                int mes2 = localDate2.getMonthValue();
                int anio2 = localDate2.getYear();

                a.EscribirFichero("\nVendedor", "\nHora:", hora2, minuto2, segundo2, "\nFecha:", dia2, mes2, anio2);

                int opc1;
                do {

                    System.out.println("Digite la opcion a solicitar");
                    System.out.println("1-Venta nueva");
                    System.out.println("2-Consultar inventario");
                    System.out.println("3-Salir del programa");
                    System.out.println("Digite la opcion");
                    opc1 = in.nextInt();

                    switch (opc1) {
                        case 1:

                            System.out.println("**Menu para realizar nueva venta**");
                            System.out.println("Ingrese la nueva venta que desea realizar:");

                            //Proceso de la realizacion de la venta
                            a.LeerFichero();

                            System.out.println("------------------------------");

                            break;

                        case 2:
                            System.out.println("**Menu para ver la lista de inventarios**");
                            System.out.println("La lista de los inventarios es la siguiente:");
                            a.LeerFichero();
                            break;

                        case 3:
                            System.out.println("Saliendo del programa");
                            salir = true;
                            a.EscribirFichero("\nSalida del Vendedor", "\nHora:", hora2, minuto2, segundo2, "\nFecha:", dia2, mes2, anio2);
                            break;

                        default:
                            System.out.println("Solo numeros entre 1 al 4");
                            break;

                    }

                } while (opc1 != 3);

                break;

            //Modo invitado   
            case 3:

                do {

                    System.out.println("Bienvenido invitado al sistema de ventas Don Jose");

                    System.out.println("Ingrese el usuario ");

                    usuario = in.next();

                    System.out.println("Ingrese la contraseña");

                    cont = in.next();

                } while (U.AccesoConcecidoInvitado(usuario, cont) == false);

                LocalDateTime localDate3 = LocalDateTime.now();
                int hora3 = localDate3.getHour();
                int minuto3 = localDate3.getMinute();
                int segundo3 = localDate3.getSecond();

                int dia3 = localDate3.getDayOfMonth();
                int mes3 = localDate3.getMonthValue();
                int anio3 = localDate3.getYear();

                a.EscribirFichero("\nInvitado", "\nHora:", hora3, minuto3, segundo3, "\nFecha:", dia3, mes3, anio3);
                int opc2;

                do {
                    System.out.println("Digite la opcion a solicitar");
                    System.out.println("1-Consultar inventario");
                    System.out.println("2-Salir del programa");
                    opc2 = in.nextInt();
                    switch (opc2) {

                        case 1:
                            System.out.println("**Menu para ver la lista de inventarios**");
                            System.out.println("La lista de los inventarios es la siguiente:");
                            a.LeerFichero();
                            break;

                        case 2:
                            System.out.println("Saliendo del programa");
                            salir = true;
                            a.EscribirFichero("\nSalida del Invitado", "\nHora:", hora3, minuto3, segundo3, "\nFecha:", dia3, mes3, anio3);
                            break;

                    }

                } while (opc2 != 2);

                break;

        }

    }

}
