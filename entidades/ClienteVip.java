/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapps.entidades;

import java.util.ArrayList;

/**
 *
 * @author agush
 */
public class ClienteVip extends Usuario {
    
    private ArrayList<Tarjeta> tarjetas = new ArrayList<>();

    public ClienteVip(String nombre, int cbu, String sucursal, double montoCuenta, int dni) {
        super(nombre, cbu, sucursal, montoCuenta, dni);
    }
    
    
}
