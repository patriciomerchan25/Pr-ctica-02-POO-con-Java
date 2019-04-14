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
public class ComputadoraPersonal extends LineaMarron {
    
    private String cpu;
    private String monitor;
    private String parlante;
    private String mouse;

    public ComputadoraPersonal(int codigo, String marca, String color, double Precio) {
        super(codigo, marca, color, Precio);
    }

    
    public ComputadoraPersonal(String lineaGrande, String audio, String imagen, String sonido, int codigo, String marca, String color, double Precio) {
        super(lineaGrande, audio, imagen, sonido, codigo, marca, color, Precio);
    }
    
    

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setParlante(String parlante) {
        this.parlante = parlante;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getParlante() {
        return parlante;
    }

    public String getMouse() {
        return mouse;
    }

    @Override
    public String toString() {
        return "ComputadoraPersonal{" + "cpu=" + cpu + ", monitor=" + monitor + ", parlante=" + parlante + ", mouse=" + mouse + '}';
    }
    
    
    
    
}
