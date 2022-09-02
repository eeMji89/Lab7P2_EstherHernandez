
package lab7p2_estherhernandez;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
    
    public void CargarP (){
        archivo = new File("./Plantas.txt" );
        if (archivo.exists()) {
            Scanner sc1 = null;
            Scanner sc2 = null;
            try{
               sc1 = new Scanner(archivo); 
               sc2 = new Scanner(archivo); 
               while (sc1.hasNext()){
                   sc1.useDelimiter("|");
                   sc2.useDelimiter(":");
                   String temp = sc1.next();
               }
            }
            catch(Exception e){
                
            }
        } 
    }
    public void CargarZ(){
        archivo = new File("./Zombies_.txt" );
        if (archivo.exists()) {
            Scanner sc1 = null;
            Scanner sc2 = null;
            
        } 
    }

}
