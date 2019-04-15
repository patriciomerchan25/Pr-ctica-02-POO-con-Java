/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.AireAcondicionado;
import ec.edu.ups.clases.ComputadoraPersonal;
import ec.edu.ups.clases.Electrodomestico;
import ec.edu.ups.clases.LineaMarron;
import ec.edu.ups.clases.LineaBlanca;
import ec.edu.ups.clases.Refrigerador;
import ec.edu.ups.clases.Televisor;
import java.util.ArrayList;
import java.util.List;

/**  
 * @since 2019
 * @see http://ups.edu.ec
 * @author Patricio Merchán
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Televisor jvc=new Televisor("jvc 12", "30 cm", "25cm", "2 puertos", "linea 50 Style",
                "mp3", "hd", "estero", 25, "JVC", "jvc smart tv",300);
        
        System.out.println(jvc);
        System.out.println("");
        System.out.println(jvc.instalar());
        System.out.println(jvc.configurar());
        System.out.println("\n");
        
        ComputadoraPersonal hp=new ComputadoraPersonal("4.3 Intel Celeron", "Pantalla HP 24", "Cybertel CYB S213", "mj-25", "linea 55 Style",
                "mp3", "sd", "estandar", 125, "HP", "HP 14", 500);
        
         System.out.println(hp);
        System.out.println("");
        System.out.println(hp.instalar());
        System.out.println(hp.configurar());
        System.out.println("\n");
        
        
        AireAcondicionado daikin = new AireAcondicionado("rp 12", "120-gt", "2.3 vp", "ASTRA 1.8 2.0",
                "linea 10 Style", "2 veces a la seman", "frio o caliente ", "no", 44, "Daikin", "SPLIT DAIKIN INVERTER", 800.50);
          System.out.println(daikin);
        System.out.println("");
        System.out.println(daikin.instalar());
        System.out.println(daikin.configurar());
        System.out.println("\n");
        
        
        Refrigerador sukasa=new Refrigerador("mediano", "2", "4 ", "40 ºF (4.4 ºC)", "linea 5 Style",
                "2 veses", "no", "guardar todo tipo de comida", 661, "Indurama", "SUKASA Frost 381L", 700.65);
        System.out.println(sukasa);
        System.out.println("");
        System.out.println(sukasa.instalar());
        System.out.println(sukasa.configurar());
        System.out.println("\n");
        
        List <Electrodomestico> lista = new ArrayList<>();
        
        lista.add(jvc);
        lista.add(hp);
        lista.add(daikin);
        lista.add(sukasa);
        
         for(Electrodomestico electrodomestico : lista){
            if(electrodomestico instanceof Televisor){
                Televisor temp = (Televisor) electrodomestico;
                System.out.println(temp);
            }
            else if(electrodomestico instanceof ComputadoraPersonal){
                ComputadoraPersonal temp = (ComputadoraPersonal) electrodomestico;
                System.out.println(temp);
            }
            else if(electrodomestico instanceof AireAcondicionado){
                AireAcondicionado temp = (AireAcondicionado) electrodomestico;
                System.out.println(temp);
            }
            else if(electrodomestico instanceof Refrigerador){
                Refrigerador temp = (Refrigerador) electrodomestico;
                System.out.println(temp);
            }
        }
        
        System.out.println("");
    }
   
}
