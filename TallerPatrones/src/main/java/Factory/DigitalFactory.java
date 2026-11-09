/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author james
 */
public class DigitalFactory extends ProductoFactory{
    private double tamano;
    private String formato;

    public DigitalFactory(double tamano, String formato) {
        this.tamano = tamano;
        this.formato = formato;
    }

    @Override
    public Producto crearProducto() {
        return new ProductoDigital(tamano, formato); 
    }
}
