/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexa
 */
public class Ganar_Perder {
    private boolean GameOver;
    Chances chance=new Chances();
    
    public Ganar_Perder(){
        this.GameOver=false;
    }
    
    public boolean getGameOver(){
       return GameOver;
   }
    public void setGameOver(boolean gameover){
       this.GameOver=gameover;
   }
    public void perder(int intentos_Fallidos){
        if(intentos_Fallidos==5){
            JOptionPane.showMessageDialog(null,"¡Perdiste, inténtalo de nuevo!");
            setGameOver(true);
        }
    }
    public void ganar(String frase){
        if(!frase.contains("_")){
            JOptionPane.showMessageDialog(null,"¡Felicidades, ganaste!");
            setGameOver(true);
        }
       
    }
   
}
