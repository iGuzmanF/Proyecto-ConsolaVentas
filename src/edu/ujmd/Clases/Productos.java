/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Clases;

import java.util.Scanner;

/**
 *
 * @author meev9
 */
public class Productos {

    private int CodProducto;

    private int Cantidad;

    private String NombreProducto;

    public Productos() {
    }

    Scanner in = new Scanner(System.in);

    public int getCodProducto() {
        return CodProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setCodProducto(int CodProducto) {
        this.CodProducto = CodProducto;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public void AgregarProducto(int CodP, int cantidad) {

        CodP = CodProducto;

        cantidad = Cantidad;

    }

    public void MostrarProducto(int cod, int ca) {
        System.out.println("Codigo/Producto");

        System.out.println(cod + "," + ca);
    }

}
