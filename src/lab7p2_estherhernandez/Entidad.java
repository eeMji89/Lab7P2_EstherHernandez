/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Entidad {
     private String nombre;
    private double ataque;
    private double vida;

    public Entidad() {
    }

    public Entidad(String nombre, double ataque, double vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Entidad{" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + '}';
    }

    
}
