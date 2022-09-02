
package lab7p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Defensa extends Plantas {
    
    private int altura;
    private int nivel;
    private int peso;

    public Defensa() {
        super();
    }

    public Defensa(int altura, int nivel, int peso, String rango, String nombre, double ataque, double vida) {
        super(rango, nombre, ataque, vida);
        this.altura = altura;
        this.nivel = nivel;
        this.peso = peso;
    }

   
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+"  Defensa{" + "altura=" + altura + ", nivel=" + nivel + ", peso=" + peso + '}';
    }
    
    
   
    
}
