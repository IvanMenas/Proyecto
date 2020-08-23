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
    //se declara una variable
    private boolean GameOver;
    
    public Ganar_Perder(){
        this.GameOver=false;//se declara la variable como false
    }
    
    public boolean getGameOver(){
       return GameOver;//devuelve el valor nuevo
   }
    public void setGameOver(boolean gameover){
       this.GameOver=gameover;//el parámetro sirve almacenar el nuevo valor
   }
    public void perder(int intentos_Fallidos){//se recibe como parámetro los intentos de la clase chance
        if(intentos_Fallidos==6){
            JOptionPane.showMessageDialog(null,"¡Perdiste, inténtalo de nuevo!");
            setGameOver(true);
        }//fin del if
    
    }//fin del método perder
    public void ganar(String frase){//se recibe como parámetro la frase de la clase ahorcado
        if(!frase.contains("_")){
            JOptionPane.showMessageDialog(null,"¡Felicidades, ganaste!");
            setGameOver(true);
        }//fin del if
       
    }//fin del método ganar
   
}//fin de la clase Ganar_Perder
