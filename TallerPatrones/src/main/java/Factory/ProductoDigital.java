/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author james
 */
public class ProductoDigital implements Producto {
    private double tamano;
    private String formato;

    public ProductoDigital(double tamano, String formato) {
        this.tamano = tamano;
        this.formato = formato;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("tamano: " + tamano + " mb, formato: " + formato);
    }
}
