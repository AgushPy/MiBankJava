/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapps.entidades;

/**
 *
 * @author agush
 */
public class ClienteNormal extends Usuario {
    private Tarjeta tarjeta;

    public ClienteNormal(Tarjeta tarjeta, String nombre, int cbu, String sucursal, double montoCuenta, int dni) {
        super(nombre, cbu, sucursal, montoCuenta, dni);
        this.tarjeta = tarjeta;
    }
    
    
}
