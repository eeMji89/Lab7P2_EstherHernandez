/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Zombies extends Entidad {

    public Zombies() {
        super();
    }

    
    public Zombies(String nombre, double ataque, double vida) {
        super(nombre, ataque, vida);
    }

    @Override
    public String toString() {
        return "Zombies{" +super.toString() + '}';
    }
   
   
    
}
