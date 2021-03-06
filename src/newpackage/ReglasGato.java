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
public class ReglasGato extends javax.swing.JFrame {

    /**
     * Creates new form ReglasGato
     */
    public ReglasGato() {
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

        jPanel1 = new javax.swing.JPanel();
        lblRules = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRules.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblRules, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 220, 210));

        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 240, 270));

        lblBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/img/wood.jpg"))); // NOI18N
        getContentPane().add(lblBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MyRoom.GoTo("MainMenu");
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        rules();//se llama el método rules para poder ejecutarlo
    }//GEN-LAST:event_formWindowOpened

    Roomer MyRoom = new Roomer();
    
    private void rules(){
      String ru="";//variable para almacenar toda la información del arreglo
      String arreglo[]= new String [4];//declaración del arreglo
      //se llena el arreglo// el <html> y el <P> es para poder hacer un saltó de línea en el label
      arreglo[0]="<html>1. Consiste en dos jugadores, uno será símbolo X y el otro O.<P>";
      arreglo[1]="<html>2. Se juega por turnos, primero el jugador con la X y después el jugador con la O.<P>";
      arreglo[2]="<html>3. Se puede ganar de ocho maneras distintas.<P>";
      arreglo[3]="<html>4. También hay posibilidades de quedar empate.<P>";
      
      for(int r=0;r<arreglo.length;r++){
          if(r==0){
              ru=ru+arreglo[0];
          }//fin del if
          else if(r==1){
              ru=ru+arreglo[1];
          }//fin del else if
          else if(r==2){
              ru=ru+arreglo[2];
          }//fin del else if
          else if(r==3){
              ru=ru+arreglo[3];
          }//fin del else if 
      }//fin del for
      lblRules.setText(ru);//se muestra toda la información que se almacenó
   }//fin de rules
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ReglasGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReglasGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReglasGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReglasGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReglasGato().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBG;
    private javax.swing.JLabel lblRules;
    // End of variables declaration//GEN-END:variables
}
