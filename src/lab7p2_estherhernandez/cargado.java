
package lab7p2_estherhernandez;

import java.util.ArrayList;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class cargado extends Zombies {
    private int tam;
    private int enojo;
    private int edad;
    private ArrayList<String> personas = new ArrayList();

    public cargado() {
        super();
    }

    
    public cargado(int tam, int enojo,int edad, String nombre, double ataque, double vida) {
        super(nombre, ataque, vida);
        this.tam = tam;
        this.enojo = enojo;
        this.edad = edad;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getEnojo() {
        return enojo;
    }

    public void setEnojo(int enojo) {
        this.enojo = enojo;
    }

    public ArrayList<String> getPersonas() {
        return personas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setPersonas(ArrayList<String> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return super.toString()+" cargado{" + "tam=" + tam + ", enojo=" + enojo + ", personas=" + personas + '}';
    }
    
    
    
}
