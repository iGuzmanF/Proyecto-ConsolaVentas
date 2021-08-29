/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Clases;

/**
 *
 * @author meev9
 */
public class Usuarios {

    //Declaramos las constantes para nuestro programa:usuario y contraseña
    private String Admin = new String("admin");//Usuario Admin

    private String ContraseñaA = new String("admin123");//Contraseña del Admin

    //--------------------------------------------------
    private String Vendedor = new String("vendedor");//Usuario del vendedor

    private String ContraseñaV = new String("vendedor123");//Contraseña del vendedor

    //---------------------------------------------------------
    private String Invitado = new String("invitado");//Usuario del invitado

    private String ContraseñaI = new String("invitado123");//Contraseña del invitado

    public Usuarios() {

    }

    /*
     
    LLUVIAS DE IDEAS
    
    1. Cada usuario tendra una contraseña
    
    2. Tenemos que validar si el usuario ingresado es correcto
    
    3. Una vez el usuario este validado, ingresamos al menu
    
    
    
     */
    //En este metodo, validaremos si el usuario y contraseña ingresado es correcto
    
    
    public boolean AccesoConcecidoAdministrador(String us, String con) {

        boolean paso=false;
        if (Admin.equals(us) && ContraseñaA.equalsIgnoreCase(con)) {
            System.out.println("Acceso concedido!!!");
            paso=true;

        } else {

            System.out.println("Vuelva a iniciar las credenciales");
            paso=false;
        }
        
        return paso;

    }

    public boolean AccesoConcedidoVendedor(String us, String con) {
        
        boolean paso2;
        if (Vendedor.equals(us) && ContraseñaV.equalsIgnoreCase(con)) {
            System.out.println("Acceso concedido!!!");
            paso2=true;
        } else {
            System.out.println("Acceso denegado, vuelva a ingresar usuario o contraseña");
            paso2=false;
        }
        
        return paso2;
    }

    public boolean AccesoConcecidoInvitado(String us, String cont) {
        boolean paso3;
        if (Invitado.equals(us) && ContraseñaI.equalsIgnoreCase(cont)) {
            System.out.println("Acceso concedido");
            paso3=true;
        } else {
            System.out.println("Acceso denegado, vuelva a ingresar usuario o contraseña");
            paso3=false;
        }
        
        return paso3;
    }

}
