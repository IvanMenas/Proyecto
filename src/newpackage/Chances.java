/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Chances {
     private int Intentos_Totales;
    private int Intentos_Fallidos;

    //Constructor
    public Chances() {
        this.Intentos_Totales = 6;
       this.Intentos_Fallidos=0;
    }
    
    //Encapsulamiento
    public int getIntentos_Totales() {
        return Intentos_Totales;
    }

    public void setIntentos_Totales(int Intentos_Totales) {
        this.Intentos_Totales = Intentos_Totales;
    }

    public int getIntentos_Fallidos() {
        return Intentos_Fallidos;
    }

    public void setIntentos_Fallidos(int Intentos_Fallidos) {
        this.Intentos_Fallidos = Intentos_Fallidos;
    }
    
    public int Intentos_Restantes(int intentos_totales, int intentos_fallidos){
     return intentos_totales-intentos_fallidos;   

    }
}//Fin clase Chances
