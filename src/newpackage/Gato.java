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
        mensaje=new JLabel("bienvenidos al juego");
        mensaje.setBounds(150, 40,  200, 30);
        this.add(mensaje); 
        iniciar=new JButton("iniciar juego"); 
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
        
         
         
     } 
  
    public static void main(String[] args) {
       Gato ventana= new Gato() {
        }; 
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(500, 550);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false );
        ventana.setTitle("juego de gato");
        ventana.setVisible(true);
        }
    
     @Override
           public void actionPerformed(ActionEvent e) {
            if(e.getSource()==iniciar){
                turno=0;
                 JOptionPane.showConfirmDialog(null, " COMIENZO DEL JUEGO"); 
                 jugador1=JOptionPane.showInputDialog(this,"escriba el nombre del primer jugador "); 
                 jugador2=JOptionPane.showInputDialog(this,"escriba el nombre del segundo jugador ");
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
     }// fin de actionPerformed
 public void iniciardenuevo() {
for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
             tablero[i][j].setEnabled(true);
             tablero[i][j].setText("");
             tablero[i][j].setBackground(colorB);
     }// fin del segundo for 
  } // fin del primer for 
}// fin de la clase iniciardenuevo 

// maaaa


}// fin del main 
//fin ssssssss