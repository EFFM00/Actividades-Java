package com.company;

public class Articulo {
    private String nombre;
    private String descripcion;
    private double precioVenta;
    private double precioCompra;
    private int cantidad;

    public Articulo(String nombre, String descripcion, int cantidad, double precioCompra, double precioVenta){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean hayStock(){
        return cantidad > 0;
    }

    public String cuantoStock(int cantidadDeseada){
        if (cantidadDeseada > 0){
            return "Hay " + cantidad + " disponibles";
        } else {
            return "No hay stock disponible";
        }
    }

    public double consultarPrecio(){
        return precioVenta;
    }
}

