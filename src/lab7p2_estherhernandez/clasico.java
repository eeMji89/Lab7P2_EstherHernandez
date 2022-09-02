
package lab7p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class clasico extends Zombies {
    private int experiencia;
    bandera b;

    public clasico() {
    }

    public clasico(int experiencia, bandera b, String nombre, double ataque, double vida) {
        super(nombre, ataque, vida);
        this.experiencia = experiencia;
        this.b = b;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public bandera getB() {
        return b;
    }

    public void setB(bandera b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString()+ "clasico{" + "experiencia=" + experiencia + ", b=" + b + '}';
    }
    
    
}
