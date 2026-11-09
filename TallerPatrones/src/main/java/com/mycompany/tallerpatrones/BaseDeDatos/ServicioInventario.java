/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones.BaseDeDatos;

/**
 *
 * @author james
 */
public class ServicioInventario {

    public String consultarInventario() {
        GestorBaseDatos gestorBD = GestorBaseDatos.getInstance();

        String resultado = gestorBD.consultar("SELECT * FROM productos");

        String inventario = "Inventario cargado con éxito: " + resultado;
        return inventario;
    }
}
