/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.clases.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patrick
 */
public class ControladorTelevisor {
    
    private List<Televisor> lista;

    public ControladorTelevisor() {
        lista = new ArrayList<>();
    }
    
    public void create(Televisor objeto){
        lista.add(objeto);
    }
    
    public Televisor read(int codigo){
        for (Televisor televisor : lista) {
            if(televisor.getCodigo() == codigo){
                return televisor;
            }
        }
        return null;
    }
    
    public void update(Televisor objeto){
        for (int i = 0; i < lista.size(); i++) {
            Televisor elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Televisor elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }
}
