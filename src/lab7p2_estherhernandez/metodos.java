
package lab7p2_estherhernandez;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
    private String leer(String ruta) throws FileNotFoundException, IOException{
       return new BufferedReader(new FileReader (ruta)).readLine();
    }
    
    public void CargarP (){
        archivo = new File("./Plantas.txt" );
        if (archivo.exists()) {
            Scanner sc1 = null;
            Scanner sc2 = null;
            try{
                String p = leer("./Plantas.txt");
                Plantas pt;
                String[] temp = p.split("\\|");
                for (int i = 0; i < temp.length; i++) {
                    String t= temp [i];
                    String[]temp2 = t.split(",");
                        
                    for (int j = 0; j < temp2.length; j++) { 
                        if (temp2[j].contains("_")) {
                            String [] temp3 = temp[i].split("_");
                        }
                        else{
                            String [] temp4 = temp2[i].split("=");
                            if (temp4[0].equalsIgnoreCase("Nombre")){
                                String nombrept= temp4[1];
                                
                            }
                            else if (temp4[0].equalsIgnoreCase("")){
                                
                                
                            }
                        }
                        
                        
                        for (int k = 0; k < temp3[i].length(); k++) {
                            
                        }
                        if (temp3[0].equals("Nombre")){
                            
                        }
                        else{
                        }
                        
                        
                    }
                    
                }
            
               /* sc1 = new Scanner(p); 
               sc2 = new Scanner(z); 
               while (sc1.hasNext()){
                   sc1.useDelimiter("|");
                   sc2.useDelimiter(":");
                   String temp = sc1.next();
               }*/
            }
            catch(Exception e){
                
            }
        } 
    }
    public void CargarZ() throws IOException{
        archivo = new File("./Zombies_.txt" );
        String z = leer("./Zombies_.txt");
        if (archivo.exists()) {
            Scanner sc1 = null;
            Scanner sc2 = null;
            
        } 
    }

}
