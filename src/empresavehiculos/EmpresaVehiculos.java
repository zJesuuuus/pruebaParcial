/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresavehiculos;

/**
 *
 * @author ACER
 */
public class EmpresaVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculos carro = new Vehiculos("Totoya", "Corolla", 120);
        Vehiculos moto = new Vehiculos("Suzuki", "GN", 220);
        
        System.out.println("---- VEHICULOS ----");
        
        System.out.println(carro.getMarca() + " " + carro.getModelo() + " Velocidad Actual: " + carro.getVelocidadActual());
        System.out.println(moto.getMarca() + " " + moto.getModelo() + " Velocidad Actual: " + moto.getVelocidadActual());
    }
    
}
