/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Electrodomestico es la clase "hija"  
 * @since 2019
 * @see http://ups.edu.ec
 * @author Patricio Merchá
 */
public class Refrigerador extends LineaBlanca {
    
    
    private String congelar;
    private String numeroPuertas; 
    private String led; 
    private String temperatura; 
    
    
    public Refrigerador(String lineaPequenia, String limpieza, String clima, String cosina, int codigo, String marca, String color, double Precio) {
        super(lineaPequenia, limpieza, clima, cosina, codigo, marca, color, Precio);
    }

    
    public void setCongelar(String congelar) {
        this.congelar = congelar;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setLed(String led) {
        this.led = led;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getCongelar() {
        return congelar;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getLed() {
        return led;
    }

    public String getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "Refrigerador{" + "congelar=" + congelar + ", numeroPuertas=" + numeroPuertas + ", led=" + led + ", temperatura=" + temperatura + '}';
    }
    
    
    
    
 
    
    
    
}
