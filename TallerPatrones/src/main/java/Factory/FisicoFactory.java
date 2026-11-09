/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author james
 */
public class FisicoFactory extends ProductoFactory {
    private double peso;
    private String dimensiones;

    public FisicoFactory(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    @Override
    public Producto crearProducto() {
        return new ProductoFisico(peso, dimensiones); 
    }
}
