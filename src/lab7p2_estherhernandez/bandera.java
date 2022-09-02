/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_estherhernandez;

import java.awt.Color;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class bandera {
    private Color color;
    private String direccion;

    public bandera(Color color, String direccion) {
        this.color = color;
        this.direccion = direccion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "bandera{" + "color=" + color + ", direccion=" + direccion + '}';
    }
    
    
}
