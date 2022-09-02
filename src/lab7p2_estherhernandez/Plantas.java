/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Plantas extends Entidad{
    private String rango;
    public Plantas() {
        super();
    }
    
    
    public Plantas(String rango, String nombre, double ataque, double vida) {
        super(nombre, ataque, vida);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Plantas{" + super.toString()+ "rango=" + rango + '}';
    }

   

    
    
    
}
