
package lab7p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class explosiva extends Plantas {
    private int magnitud;

    public explosiva() {
        super();
    }
    

    public explosiva(int magnitud, String nombre, double ataque, double vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.magnitud = magnitud;
    }

    public int getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(int magnitud) {
        this.magnitud = magnitud;
    }

    @Override
    public String toString() {
        return super.toString()+"explosiva{" + "magnitud=" + magnitud + '}';
    }
    
    
}
