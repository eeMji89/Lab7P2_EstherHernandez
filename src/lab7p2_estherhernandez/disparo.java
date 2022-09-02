
package lab7p2_estherhernandez;

import java.awt.Color;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class disparo extends Plantas {
    private String proyectil;
    private Color color;

    public disparo() {
        super();
    }

    public disparo(String proyectil, Color color, String rango, String nombre, double ataque, double vida) {
        super(rango, nombre, ataque, vida);
        this.proyectil = proyectil;
        this.color = color;
    }


    public String getProyectil() {
        return proyectil;
    }

    public void setProyectil(String proyectil) {
        this.proyectil = proyectil;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+" disparo{" + "proyectil=" + proyectil + ", color=" + color + '}';
    }
    
    
    
}
