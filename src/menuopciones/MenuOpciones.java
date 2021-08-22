/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuopciones;

/**
 *
 * @author ddera
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOpciones {


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opc;
        
        while(!salir)
        {
            System.out.println("Menu de opciones");
            System.out.println("1. Venta nueva");
            System.out.println("2. Consultar inventarios");
            System.out.println("3. Cambiar contraseña");
            System.out.println("4. Salir del programa");
        
            try
            {
         System.out.println("Seleccione la opcion que desee realizar");
         opc = sn.nextInt();
         
         switch(opc)
             {
             case 1:
                 
                 System.out.println("**Menu para realizar nueva venta**");
                 System.out.println("Ingrese la nueva venta que desea realizar:");
                 break;
                 
             case 2:
                 System.out.println("**Menu para ver la lista de inventarios**");
                 System.out.println("La lista de los inventarios es la siguiente:");
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
    
        }
      catch(InputMismatchException e)
              {
              System.out.println("debes insertar un numero antes");
              sn.next();
              }
}
        
    }
    } 