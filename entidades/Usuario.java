/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapps.entidades;

import java.util.Scanner;

/**
 *
 * @author agush
 */
public abstract class Usuario {
    private String nombre;
    private int cbu;
    private String sucursal;
    private double montoCuenta;
    private int dni;
    Scanner leer = new Scanner(System.in);

    public Usuario(String nombre, int cbu, String sucursal, double montoCuenta, int dni) {
        this.nombre = nombre;
        this.cbu = cbu;
        this.sucursal = sucursal;
        this.montoCuenta = montoCuenta;
        this.dni = dni;
    }
    
    
    
    public void crearCuenta(){
        System.out.println("Porfavor indique su nombre");
        this.nombre = leer.next();
        this.cbu = (int)Math.random()*(900-100);
        System.out.println("Indique la sucursal del cliente");
        this.sucursal = leer.next();
        System.out.println("Indique el documento del client");
        this.dni = leer.nextInt();
    }
    

    
}
