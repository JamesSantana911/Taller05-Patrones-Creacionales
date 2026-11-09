/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author james
 */
public class ProductoFisico implements Producto {
    private double peso;
    private String dimensiones;
    
    public ProductoFisico(double peso, String dimensiones) {
     this.peso = peso;
     this.dimensiones = dimensiones;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("peso: " + peso + " kg, dimensiones: " + dimensiones);
    }
}
