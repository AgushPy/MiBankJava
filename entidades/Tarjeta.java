/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapps.entidades;

/**
 *
 * @author agush
 */
public abstract class Tarjeta {
    private double saldoTarjeta;
    private int cuotasMaximasTarjeta;
    private long numeroTarjeta;
    private double creditoMaximoTarjeta;
    private boolean compraEnUsd;
    private boolean seguroDeVida;

    public Tarjeta(double saldoTarjeta, int cuotasMaximasTarjeta, long numeroTarjeta, double creditoMaximoTarjeta, boolean compraEnUsd, boolean seguroDeVida) {
        this.saldoTarjeta = saldoTarjeta;
        this.cuotasMaximasTarjeta = cuotasMaximasTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.creditoMaximoTarjeta = creditoMaximoTarjeta;
        this.compraEnUsd = compraEnUsd;
        this.seguroDeVida = seguroDeVida;
    }

    public double getSaldoTarjeta() {
        return saldoTarjeta;
    }

    public void setSaldoTarjeta(double saldoTarjeta) {
        this.saldoTarjeta = saldoTarjeta;
    }

    public int getCuotasMaximasTarjeta() {
        return cuotasMaximasTarjeta;
    }

    public void setCuotasMaximasTarjeta(int cuotasMaximasTarjeta) {
        this.cuotasMaximasTarjeta = cuotasMaximasTarjeta;
    }

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getCreditoMaximoTarjeta() {
        return creditoMaximoTarjeta;
    }

    public void setCreditoMaximoTarjeta(double creditoMaximoTarjeta) {
        this.creditoMaximoTarjeta = creditoMaximoTarjeta;
    }

    public boolean isCompraEnUsd() {
        return compraEnUsd;
    }

    public void setCompraEnUsd(boolean compraEnUsd) {
        this.compraEnUsd = compraEnUsd;
    }

    public boolean isSeguroDeVida() {
        return seguroDeVida;
    }

    public void setSeguroDeVida(boolean seguroDeVida) {
        this.seguroDeVida = seguroDeVida;
    }
    
    
}
