
package lab7p2_estherhernandez;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class metodos {
    private File archivo;
    private ArrayList<Plantas> plantas = new ArrayList();
    private ArrayList<Zombies> zombies = new ArrayList();

    public metodos() {
        
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Plantas> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Plantas> plantas) {
        this.plantas = plantas;
    }

    public ArrayList<Zombies> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombies> zombies) {
        this.zombies = zombies;
    }
    
    public void EscribirA ()throws IOException {
        FileWriter fw = null;
        FileReader fr = null;
        

    }
    
    public void CargarA (){
        
    }
    

}
