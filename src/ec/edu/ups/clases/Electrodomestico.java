/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * Electrodomestico es la clase "abuelo"  
 * @since 2019
 * @see http://ups.edu.ec
 * @author Patricio Merchán
 */
public class Electrodomestico {
    
    //Atributos de la clase Electrodomestico 
    
    private int codigo;
    private String marca;
    private String color;
    private double Precio;

    // generamos el constructor
    public Electrodomestico(int codigo, String marca, String color, double Precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.color = color;
        this.Precio = Precio;
    }
    
    // generamos los setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

   // generamos los getters
    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return Precio;
    }

    // generamos el to String
    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", marca=" + marca + ", color=" + color + ", Precio=" + Precio + '}';
    }
    
    
    
}
