/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
/**
 *
 * @author IM
 */
public class Ahorcado extends javax.swing.JFrame {

    /**
     * Creates new form Ahorcado
     */
    public Ahorcado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnGenerete = new javax.swing.JButton();
        lblWord = new java.awt.Label();
        txtLetra = new java.awt.TextField();
        btnTry = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        lblintentos = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        lblTorso = new javax.swing.JLabel();
        lblHead2 = new javax.swing.JLabel();
        lblBraDer = new javax.swing.JLabel();
        lblPieDer = new javax.swing.JLabel();
        lblPieIzq = new javax.swing.JLabel();
        lblBraIzq = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblBackGround = new javax.swing.JLabel();
        lblPieDer1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGenerete.setText("Generar palabra");
        btnGenerete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenereteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));
        getContentPane().add(lblWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 280, 36));

        txtLetra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtLetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 45, -1));
        txtLetra.getAccessibleContext().setAccessibleName("");

        btnTry.setText("Intentar");
        btnTry.setEnabled(false);
        btnTry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTryActionPerformed(evt);
            }
        });
        getContentPane().add(btnTry, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));
        getContentPane().add(lblMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 280, 40));

        lblintentos.setText("Intentos Restantes: 6");
        getContentPane().add(lblintentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 140, 20));
        getContentPane().add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 90, 60));
        getContentPane().add(lblTorso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, 70));
        getContentPane().add(lblHead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 70, 120));
        getContentPane().add(lblBraDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 110, 90));
        getContentPane().add(lblPieDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 60, 40));
        getContentPane().add(lblPieIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 70, 40));
        getContentPane().add(lblBraIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, 110));

        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        lblBackGround.setBackground(new java.awt.Color(255, 153, 0));
        lblBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/img/AhorcadoBackGround2.jpg"))); // NOI18N
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        lblPieDer1.setText("jLabel2");
        getContentPane().add(lblPieDer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 60, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        Word w = new Word();
        Chances C = new Chances();
        Ganar_Perder GP=new Ganar_Perder();
        
    private void btnGenereteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenereteActionPerformed
        // TODO add your handling code here:
        btnTry.setEnabled(true);
        lblWord.setText("");
        String[] x = {"PERRO", "GATO", "COMPUTADORA", "PROGRAMACION", "ZAPATO", "PATINETA", "UKELELE", "MANGO", "BOTELLA",
        "MARCIANOS", "ESCRITORIO", "VAPOR", "ORIENTE", "CORONAVIRUS", "VIKINGOS", "IDIOMA", "ESPAÑOL", "CUARENTENA"};
        Random rand = new Random();

        int n = rand.nextInt(17);
        String SelectedWord = x [n];
        
        System.out.println(SelectedWord);
        int WordLength = SelectedWord.length();
        
        for(int i = 0; i < WordLength; i++){
            String lblText = lblWord.getText();
            lblWord.setText(lblText + " _");
        }
        w.setWord(SelectedWord);
    }//GEN-LAST:event_btnGenereteActionPerformed

    private void btnTryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTryActionPerformed
        lblMsg.setText("");
        if (txtLetra.getText().length()!= 1 ){
            lblMsg.setText("Cantidad de caracteres invalida");
        }
        else {
            w.setLetter(txtLetra.getText().toUpperCase().charAt(0));
                if(w.FindLetter(w.getWord(), w.getLetter())){
                    lblWord.setText(w.ReplaceLetter(lblWord.getText(), w.getWord(), w.getLetter()));
                }else{
                    C.setIntentos_Fallidos(C.getIntentos_Fallidos()+1);
                    int IntentosRestantes = C.Intentos_Restantes(C.getIntentos_Totales(), C.getIntentos_Fallidos());
                    lblintentos.setText("Intentos restantes: "+ IntentosRestantes);
                   lblHead2.setIcon(new ImageIcon(getClass().getResource("dead.png")));
                    //lblHead.setIcon(new ImageIcon(getClass().getResource("head3.png")));
                }
        
        if (C.getIntentos_Fallidos()==2){
            lblTorso.setIcon(new ImageIcon(getClass().getResource("torso.png")));
        }
        
             if (C.getIntentos_Fallidos()==3){
            lblBraIzq.setIcon(new ImageIcon(getClass().getResource("mano izquierda.png")));
        }
        
        if (C.getIntentos_Fallidos()==4){
            lblBraDer.setIcon(new ImageIcon(getClass().getResource("mano derecha.png")));
        }
            if (C.getIntentos_Fallidos()==5){
            lblPieDer.setIcon(new ImageIcon(getClass().getResource("pie derecho.png")));
        }
        if (C.getIntentos_Fallidos()==6){
            lblPieIzq.setIcon(new ImageIcon(getClass().getResource("pie izquierdo.png")));
             lblHead2.setIcon(new ImageIcon(getClass().getResource("F.png")));       
        }
        
        
        }
        
        
        txtLetra.setText("");
        GP.perder(C.getIntentos_Fallidos());
        GP.ganar(lblWord.getText());
        
        if(GP.getGameOver()){
        cleaner();
        GP.setGameOver(false);
        C.setIntentos_Fallidos(0);
        C.setIntentos_Totales(6);
        w.setCompleteWord(false);
        w.setCorrectLetter(false);
        w.setLetter(' ');
        w.setWord("");
        btnTry.setEnabled(false);
        }
    }//GEN-LAST:event_btnTryActionPerformed
public void cleaner(){
    lblMsg.setText("");
    lblWord.setText("");
    lblintentos.setText("Intentos restantes: 6");
    lblBraDer.setIcon(null);
    lblBraIzq.setIcon(null);
    lblHead.setIcon(null);
    lblTorso.setIcon(null);
    lblPieDer.setIcon(null);
    lblPieIzq.setIcon(null);
    lblHead2.setIcon(null);
    
}
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowOpened
    Roomer MyRoom = new Roomer();
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MyRoom.GoTo("MainMenu");
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ahorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ahorcado().setVisible(true);
            }
        });
        
        
    }//Fin Main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerete;
    private javax.swing.JButton btnTry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblBraDer;
    private javax.swing.JLabel lblBraIzq;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblHead2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblPieDer;
    private javax.swing.JLabel lblPieDer1;
    private javax.swing.JLabel lblPieIzq;
    private javax.swing.JLabel lblTorso;
    private java.awt.Label lblWord;
    private javax.swing.JLabel lblintentos;
    private java.awt.TextField txtLetra;
    // End of variables declaration//GEN-END:variables



}//PRINCIPAL
