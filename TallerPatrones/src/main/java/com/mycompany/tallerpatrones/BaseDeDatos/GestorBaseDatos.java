/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones.BaseDeDatos;

/**
 *
 * @author james
 */
public class GestorBaseDatos {
    private static GestorBaseDatos instancia;
    
    private GestorBaseDatos(){
     System.out.println("Base de datos conectada");   
    }
    
    public static GestorBaseDatos getInstance() {
        if (instancia == null) {
            instancia = new GestorBaseDatos();
        }
        return instancia;
    }
    
    public String consultar(String query) { // en el query va lo de select from productos
        System.out.println("Ejecutando en BD: " + query);
        return "resultado"; // ejemplo de resultado
    }
    
     
        
      
}
