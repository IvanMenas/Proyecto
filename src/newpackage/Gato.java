/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author marco
 */
public abstract class Gato extends JFrame implements ActionListener{
     JButton iniciar; 
     JButton tablero [][]; 
     String jugador1,jugador2; 
     int turno =-1; 
     JLabel mensaje;
     Color colorB;
     
     public Gato(){
     
        this.setLayout(null);
        mensaje=new JLabel("Bienvenidos al juego");
        mensaje.setBounds(150, 40,  200, 30);
        this.add(mensaje); 
        iniciar=new JButton("Iniciar juego"); 
        iniciar.setBounds(175,350,150,30);
        iniciar.addActionListener(this);
        this.add(iniciar); 
        tablero=new JButton [3][3]; 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            tablero [i][j] =new JButton();
            tablero [i][j].setBounds((i+1)*80+50,(j+1)*80,80,80);
            this.add(tablero [i][j]); 
             tablero [i][j].addActionListener(this);
            }
        }// fin del for 
        colorB=tablero[0][0].getBackground();
     }//constructor 
    public static void main(String[] args) {
      // Gato ventana= new Gato() {
       // }; 
        //.setDefaultCloseOperation(3);
        //ventana.setSize(500, 550);
        //ventana.setLocationRelativeTo(null);
        //ventana.setResizable(false );
        //ventana.setTitle("juego de gato");
        //ventana.setVisible(true);
        }
    
     @Override
           public void actionPerformed(ActionEvent e) {
            if(e.getSource()==iniciar){
                turno=0; 
                 jugador1=JOptionPane.showInputDialog(this,"Escriba el nombre del primer jugador "); 
                 jugador2=JOptionPane.showInputDialog(this,"Escriba el nombre del segundo jugador ");
                 mensaje.setText("TURNO DEL JUGADOR " +jugador1);
                 iniciardenuevo();
                 
            } else{
                JButton boton=(JButton) e.getSource(); 
                if(turno==0){
                   if(boton.getText().equals("")){ 
                    boton.setBackground(Color.blue);
                    boton.setText("X");
                    boton.setEnabled(false);
                    turno=1;
                    mensaje.setText("TURNO DEL JUGADOR "+jugador2);
                    }
                }else{
                    if(turno==1){
                     if(boton.getText().equals("")){ 
                    boton.setBackground(Color.white);
                    boton.setText("O");
                    boton.setEnabled(false);
                    turno=0;
                    mensaje.setText("TURNO DEL JUGADOR  "+jugador1);
                    }// fin del if1   
                   }//fin del if2
                  }// fin del segundo else
                 }// fin del primer else 
       
        ganador1();  
        ganador2();
     }// fin de actionPerformed
 public void ganador1(){
     int ganador=0;
     
        if(tablero[0][0].getText().equals("X")&& tablero[1][0].getText().equals("X")&& tablero[2][0].getText().equals("X")){
            ganador=1;
        }//fin del if horizontal arriba
        if(tablero[0][0].getText().equals("X")&& tablero[0][1].getText().equals("X")&& tablero[0][2].getText().equals("X")){
            ganador=1;
        }//vertical izquierda
        if(tablero[0][0].getText().equals("X")&& tablero[1][1].getText().equals("X")&& tablero[2][2].getText().equals("X")){
            ganador=1;
        }//diagonal principal
        if(tablero[2][0].getText().equals("X")&& tablero[1][1].getText().equals("X")&& tablero[0][2].getText().equals("X")){
            ganador=1;
        }//diagonal inversa
        if(tablero[2][0].getText().equals("X")&& tablero[2][1].getText().equals("X")&& tablero[2][2].getText().equals("X")){
            ganador=1;
        }//vertical derecha
        if(tablero[0][2].getText().equals("X")&& tablero[1][2].getText().equals("X")&& tablero[2][2].getText().equals("X")){
            ganador=1;
        
        }//horizontal abajo
        if(tablero[1][0].getText().equals("X")&& tablero[1][1].getText().equals("X")&& tablero[1][2].getText().equals("X")){
            ganador=1;
        }//centro vertical
        if(tablero[0][1].getText().equals("X")&& tablero[1][1].getText().equals("X")&& tablero[2][1].getText().equals("X")){
            ganador=1;
        }//centro horizontal
       if(ganador==1){
       
       JOptionPane.showMessageDialog(null,"¡Felicidades "+jugador1+", ganaste!");
       }//fin del if
 }
  public void ganador2(){
     int ganador=0;
     
        if(tablero[0][0].getText().equals("O")&& tablero[1][0].getText().equals("O")&& tablero[2][0].getText().equals("O")){
            ganador=2;
        }//fin del if horizontal arriba
        if(tablero[0][0].getText().equals("O")&& tablero[0][1].getText().equals("O")&& tablero[0][2].getText().equals("O")){
            ganador=2;
        }//vertical izquierda
        if(tablero[0][0].getText().equals("O")&& tablero[1][1].getText().equals("O")&& tablero[2][2].getText().equals("O")){
            ganador=2;
        }//diagonal principal
        if(tablero[2][0].getText().equals("O")&& tablero[1][1].getText().equals("O")&& tablero[0][2].getText().equals("O")){
            ganador=2;
        }//diagonal inversa
        if(tablero[2][0].getText().equals("O")&& tablero[2][1].getText().equals("O")&& tablero[2][2].getText().equals("O")){
            ganador=2;
        }//vertical derecha
        if(tablero[0][2].getText().equals("O")&& tablero[1][2].getText().equals("O")&& tablero[2][2].getText().equals("O")){
            ganador=2;
        
        }//horizontal abajo
        if(tablero[1][0].getText().equals("O")&& tablero[1][1].getText().equals("O")&& tablero[1][2].getText().equals("O")){
            ganador=2;
        }//centro vertical
        if(tablero[0][1].getText().equals("O")&& tablero[1][1].getText().equals("O")&& tablero[2][1].getText().equals("O")){
            ganador=2;
        }//
       if(ganador==2){
       
       JOptionPane.showMessageDialog(null,"¡Felicidades "+jugador2+", ganaste!");
       }//fin del if
 }
 public void iniciardenuevo() {
for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             tablero[i][j].setEnabled(true);
             tablero[i][j].setText("");
             tablero[i][j].setBackground(colorB);
     }// fin del segundo for 
  } // fin del primer for 
}// fin de la clase iniciardenuevo 


}// fin del main 