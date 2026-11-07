/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresavehiculos;

/**
 *
 * @author ACER
 */
public class Vehiculos {
    private String marca;
    private String modelo;
    private int velocidadActual;

    public Vehiculos(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        if (velocidadActual >= 0 && velocidadActual <= 180){
            this.velocidadActual = velocidadActual;
        }else{
            this.velocidadActual = 0;
            System.out.println("Velocidad no valida. Se establece en 0 km/h");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        if (velocidadActual >= 0 && velocidadActual <= 180) {
            this.velocidadActual = velocidadActual;
        }else{
            System.out.println("La velocidad debe estar entre 0 y 180 km/h");
        }
    }
    
    public void acelerar(double incremento){
        if (incremento > 0) {
            
            if (velocidadActual + incremento <= 180) {
                velocidadActual += incremento;
            }else{
                velocidadActual = 180;
                System.out.println("La velocidad no excederse de 180km/h.");
            }
        }else{
            System.out.println("El incremento debe de ser positivo.");
        }
    }
    
    public void frenar(double decremento){
        if (decremento > 0) {
            
            if (velocidadActual - decremento >= 0) {
                velocidadActual -= decremento;
            }else{
                velocidadActual = 0;
                System.out.println("La velocidad no puede ser negativa.");
            }
        }else{
            System.out.println("La cantidad de frenado debe ser positiva.");
        }
    }
}
