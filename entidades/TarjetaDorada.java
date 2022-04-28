/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapps.entidades;

/**
 *
 * @author agush
 */
public class TarjetaDorada extends Tarjeta{

    
    public TarjetaDorada(double saldoTarjeta, int cuotasMaximasTarjeta, long numeroTarjeta, double creditoMaximoTarjeta, boolean compraEnUsd, boolean seguroDeVida) {
        super(saldoTarjeta, cuotasMaximasTarjeta, numeroTarjeta, creditoMaximoTarjeta, compraEnUsd, seguroDeVida);
        compraEnUsd = true;
        seguroDeVida= false;
    }
    
    
}
