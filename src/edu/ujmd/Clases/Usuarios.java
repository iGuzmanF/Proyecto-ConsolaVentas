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
    

     //Declaramos las variables de acceso
        
          private String Usuario;
        
          private String Contraseña;
        
        //Declaramos las constantes para nuestro programa:Nivel,usuario y contraseña
         private  int niveladmin=1;//Nivel del admin
        
         private String Admin = "admin";//Usuario Admin
        
         private String ContraseñaA ="admin123";//Contraseña del Admin
        
        //--------------------------------------------------
        
       private int nivelvendedor=2; //Nivel del vendedor
        
       private  String Vendedor="vendedor";//Usuario del vendedor
        
       private String ContraseñaV ="vendedor123";//Contraseña del vendedor
        
        //---------------------------------------------------------
        
       private int nivelinvitado=3;//Nivel del invitado
        
       private String Invitado="invitado";//Usuario del invitado
        
       private String ContraseñaI ="invitado123";//Contraseña del invitado
        
    
    
    public Usuarios()
    {
        
        
    }
    
    //En este metodo, validaremos si el usuario y contraseña ingresado es correcto
    //(Aun no implementado)
    public void AccesoConcecido( String us, String con)
    {
       
        
        if(Admin==us && ContraseñaA==con)
        {
            System.out.println("Acceso concedido");
        }
        
        else
        {
            System.out.println("Acceso denegado, vuelva a ingresar usuario o contraseña");
            
            
        }
        
        
    }
    
    
    
   
    
}
