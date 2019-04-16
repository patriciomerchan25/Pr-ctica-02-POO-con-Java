/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;
import ec.edu.ups.clases.ComputadoraPersonal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patrick
 */
public class ControladorComputadora {
      private List<ComputadoraPersonal> lista;

    public ControladorComputadora() {
        lista = new ArrayList<>();
    }
    
    public void create(ComputadoraPersonal objeto){
        lista.add(objeto);
    }
    
    public ComputadoraPersonal read(int codigo){
        for (ComputadoraPersonal computadora : lista) {
            if(computadora.getCodigo() == codigo){
                return computadora;
            }
        }
        return null;
    }
    
    public void update(ComputadoraPersonal objeto){
        for (int i = 0; i < lista.size(); i++) {
            ComputadoraPersonal elemento = lista.get(i);
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, objeto);
                break;
            }            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            ComputadoraPersonal elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }            
        }
    }
}
