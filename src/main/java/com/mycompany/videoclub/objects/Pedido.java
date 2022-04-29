/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub.objects;

import java.util.Date;

/**
 *
 * @author agus-
 */
public class Pedido {
    private Integer cantidad;
    private Date fecha;
    private String estaddo;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstaddo() {
        return estaddo;
    }

    public void setEstaddo(String estaddo) {
        this.estaddo = estaddo;
    }
    
}
