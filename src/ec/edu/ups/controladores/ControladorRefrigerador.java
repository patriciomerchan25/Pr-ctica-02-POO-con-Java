/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.clases.Refrigerador;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author patrick
 */
public class ControladorRefrigerador {
    
     private List<Refrigerador> lista;

    public ControladorRefrigerador() {
        lista = new ArrayList<>();
    }
    
    public void create(Refrigerador objeto){
        lista.add(objeto);
    }
    
    public Refrigerador read(int codigo){
        for (Refrigerador refrigerador : lista) {
            if(refrigerador.getCodigo() == codigo){
                return refrigerador;
            }
        }
        return null;
    }
    
    public void update(Refrigerador objeto){
        for (int i = 0; i < lista.size(); i++) {
            Refrigerador elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Refrigerador elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }
}
