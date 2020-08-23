/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author IM
 */
public class Roomer {
   //Esta clase funciona como un manager, el cual administra el acceso a clases y frames
    //Mediante los parámetros que recibe, y todas las validaciones las hace utilizando el switch
    public static void GoTo(String MyClass){
        switch(MyClass){
            
            case "Ahorcado":
            Ahorcado ahorcado = new Ahorcado();
            ahorcado.setVisible(true);
                break;
            
            case "Gato":
                Gato Gato;
                Gato = new Gato() {};
                Gato.setVisible(true);
                Gato.setSize(500, 550);
                Gato.setLocationRelativeTo(null);
                Gato.setResizable(false );
                Gato.setTitle("Juego de Gato");
                break;
                
            case "MainMenu":
                MainMenu MM = new MainMenu();
                MM.setVisible(true);
                break;
                
            case "ReglaGato":
                ReglasGato RG = new ReglasGato();
                RG.setVisible(true);
                break;
                
            case "ReglaAhorcado":
                ReglasAhorcado RA = new ReglasAhorcado();
                RA.setVisible(true);
                break;
                
        }//fin del switch
        
    }//fin de método GoTo
    
}//fin de la clase Roomer
