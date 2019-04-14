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
public class AireAcondicionado extends LineaBlanca{
    
       private String condensador;
    private String compresor;
    private String evaporador;
    private String termoestato;

    public AireAcondicionado(String lineaPequenia, String limpieza, String clima, String cosina, int codigo, String marca, String color, double Precio) {
        super(lineaPequenia, limpieza, clima, cosina, codigo, marca, color, Precio);
    }

    

   

    
    
    
    public void setCondensador(String condensador) {
        this.condensador = condensador;
    }

    public void setCompresor(String compresor) {
        this.compresor = compresor;
    }

    public void setEvaporador(String evaporador) {
        this.evaporador = evaporador;
    }

    public void setTermoestato(String termoestato) {
        this.termoestato = termoestato;
    }

    public String getCondensador() {
        return condensador;
    }

    public String getCompresor() {
        return compresor;
    }

    public String getEvaporador() {
        return evaporador;
    }

    public String getTermoestato() {
        return termoestato;
    }

    @Override
    public String toString() {
        return "Refrigerador{" + "condensador=" + condensador + ", compresor=" + compresor + ", evaporador=" + evaporador + ", termoestato=" + termoestato + '}';
    }
    
}
