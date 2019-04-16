/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.AireAcondicionado;
import ec.edu.ups.controladores.ControladorAireAcondicionado;
import ec.edu.ups.controladores.ControladorComputadora;
import ec.edu.ups.controladores.ControladorRefrigerador;
import ec.edu.ups.controladores.ControladorTelevisor;
import java.util.Scanner;

/**
 *
 * @author patrick
 */
public class Menu {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        Scanner letra = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        
        int opcionMenuPrincipal = 0;
        int opcionMenuAire = 0;
        int opcionMenuRefrigerador = 0;
        int opcionMenuComputador = 0;
        int opcionMenuTelevisor = 0;
        
        ControladorAireAcondicionado controladorAire = new ControladorAireAcondicionado();
        ControladorComputadora controladorComputadora=new ControladorComputadora();
        ControladorRefrigerador controladorRefrigerador=new ControladorRefrigerador();
        ControladorTelevisor controladorTelevisor=new ControladorTelevisor();
        
        do{
                    
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. CRUD Aire Acondicionado");
            System.out.println("2. CRUD Regrigerador");
            System.out.println("3. CRUD Computador");
            System.out.println("4. CRUD Televisor");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción");
            opcionMenuPrincipal = entrada.nextInt();
            
            switch(opcionMenuPrincipal){
                case 1: 
                    //opcion para el crud aire acondicionado
                    do{
                        System.out.println("MENU AIRE ACONDICIONADO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        opcionMenuAire = entrada.nextInt();
                        
                        switch(opcionMenuAire){
                            case 1:
                                //create
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo create del controlador
                                System.out.println("ingrese el condensador");
                                String condensador=letra.nextLine();
                                System.out.println("ingrese el compresor");
                                String compresor=letra.nextLine();
                                System.out.println("ingrese el evaporador");
                                String evaporador=letra.nextLine();
                                System.out.println("ingrese el termoestato");
                                String termoestato=letra.nextLine();
                                System.out.println("ingrese la lineaPequenia");
                                String lineaPequenia=letra.nextLine();
                                System.out.println("ingrese  limpieza");
                                String limpieza=letra.nextLine();
                                System.out.println("ingrese el clima");
                                String clima=letra.nextLine();
                                System.out.println("ingrese cosina");
                                String cosina=letra.nextLine();
                                System.out.println("ingrese el codigo");
                                int codigo=num.nextInt();
                                System.out.println("ingrese la marca");
                                String marca=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                String nombre=letra.nextLine();
                                System.out.println("ingrese el precio");
                                double precio=num.nextDouble();
                                
                              
                                AireAcondicionado objeto=new AireAcondicionado(condensador, compresor, evaporador, termoestato, lineaPequenia,
                                        limpieza, clima, cosina, codigo, marca, nombre, precio);
                                        
                                controladorAire.create(objeto);
                                System.out.println("\n"+objeto+"\n");
                                break;
                            case 2:
                                //read
                                //pide el codigo por teclado
                                //llama al metodo read del controlador
                                //visualizo los datos del objeto
                                System.out.println("ingrese el codigo");
                                int codigoRead=num.nextInt();
                                controladorAire.read(codigoRead);
                                break;
                            case 3:
                                //update
                                //pide todos los datos por teclado
                                //instancia un objeto
                                //llama al metodo update del controlador
                                  System.out.println("ingrese el condensador");
                                String condensadorUP=letra.nextLine();
                                System.out.println("ingrese el compresor");
                                String compresorUP=letra.nextLine();
                                System.out.println("ingrese el evaporador");
                                String evaporadorUP=letra.nextLine();
                                System.out.println("ingrese el termoestato");
                                String termoestatoUP=letra.nextLine();
                                System.out.println("ingrese la lineaPequenia");
                                String lineaPequeniaUP=letra.nextLine();
                                System.out.println("ingrese  limpieza");
                                String limpiezaUP=letra.nextLine();
                                System.out.println("ingrese el clima");
                                String climaUP=letra.nextLine();
                                System.out.println("ingrese cosina");
                                String cosinaUP=letra.nextLine();
                                
                                System.out.println("ingrese el codigo");
                                int codigoUP=num.nextInt();
                                System.out.println("ingrese la marca");
                                String marcaUP=letra.nextLine();
                                System.out.println("ingrese el nombre");
                                String nombreUP=letra.nextLine();
                                System.out.println("ingrese el precio");
                                double precioUP=num.nextDouble();
                                
                              
                                AireAcondicionado objeto1=new AireAcondicionado(condensadorUP, compresorUP, evaporadorUP, termoestatoUP, lineaPequeniaUP,
                                        limpiezaUP, climaUP, cosinaUP, codigoUP, marcaUP, nombreUP, precioUP);
                                controladorAire.update(objeto1);
                                break;
                            case 4:
                                //delete
                                //pide el codigo por teclado
                                //llama al metodo delete del controlador
                                System.out.println("ingrese el codigo");
                                int codigoDL=num.nextInt();
                                controladorAire.delete(codigoDL);
                                break;
                            case 5:
                                //regresar
                                System.out.println("Regresando al menú principal");
                                break;
                        }
                        
                    }while(opcionMenuAire !=5);
                    break;
                case 2:
                    //opcion para el crud de refrigerador
                    do{
                        
                    }while(opcionMenuRefrigerador !=5);
                    break;
                case 3:
                    //opcion para el crud de computador
                    do{
                        
                    }while(opcionMenuComputador !=5);
                    break;
                case 4:
                    //opcion para el crud de televisor
                    do{
                        
                    }while(opcionMenuTelevisor !=5);
                    break;
                case 5:
                    //opcion para salir
                    System.out.println("Adiós !!!");
                    break;
            }
        }while(opcionMenuPrincipal != 5);
        
    }
    
}
