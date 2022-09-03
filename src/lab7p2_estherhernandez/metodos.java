
package lab7p2_estherhernandez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("./Plantas.txt", false);
            bw = new BufferedWriter(fw);
            String tipo= "";
            for (Plantas p : plantas) {
                if ( p instanceof disparo) {
                    bw.write(tipo+": ("+((disparo) p).getProyectil()+","+((disparo) p).getColor()+")_");
                    
                }
                else if ( p instanceof Defensa) {
                    bw.write(tipo+": ("+((Defensa) p).getAltura()+","+((Defensa) p).getNivel()+","+((Defensa) p).getPeso() +")_");
                }
                else if ( p instanceof explosiva ) {
                    bw.write(tipo+": ("+((explosiva)p).getMagnitud()+")_");
                }
                bw.write("Rango="+p.getRango()+","+"Nombre =" +p.getNombre()+","+"Ataque="+ p.getAtaque()+",Vida="+p.getVida());
                
            }
        } catch (Exception e) {
            
        }
        

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
                double ataque=0,vida = 0;
                String tipop = "";String nombrept="";String rangot="";
                String[] temp = p.split("\\|");
                for (int i = 0; i < temp.length; i++) {
                    String t= temp [i];
                    String[]temp2 = t.split(",");
                        
                    for (int j = 0; j < temp2.length; j++) { 
                        if (temp2[j].contains("_")) {
                            String [] temp3 = temp2[i].split("_");
                            if (temp3[0].contains(":")) {
                               String[]x1 =  temp3[0].split(":");
                               tipop = x1[0];
                            }
                            else if(temp3[1].contains(":")){
                                
                            }
                        }
                        else{
                            String [] temp4 = temp2[i].split("=");
                            if (temp4[0].equalsIgnoreCase("Nombre")){
                                nombrept= temp4[1];
                            }
                            else if (temp4[0].equalsIgnoreCase("Ataque")){
                                  
                            }
                             else if (temp4[0].equalsIgnoreCase("Vida")){
                                
                                
                            }
                             else if (temp4[0].equalsIgnoreCase("Rango")){
                                rangot= temp[1];
                                
                            }
                            
                        }
   
                    }
                    if (tipop.equalsIgnoreCase("disparo")) {
                        plantas.add(new disparo());
                    }
                    else  if (tipop.equalsIgnoreCase("defensa")) {
                        plantas.add(new Defensa());
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
