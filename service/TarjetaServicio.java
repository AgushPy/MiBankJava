/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bankapps.service;

/**
 *
 * @author agush
 */
public interface TarjetaServicio {
    public double compraUsd();
    
    public double ventaUsd();
    
    public void hacerTarjeta();
    
    public void pagarEnCuotas(int cuotas,double monto);
    
    
}
