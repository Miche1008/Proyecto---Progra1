/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Miche
 */
public class Recuperar_Contraseña extends javax.swing.JFrame {
    
    int xMouse, yMouse;

    /**
     * Creates new form Recuperar_Contraseña
     */
    public Recuperar_Contraseña() {
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

        jLabel7 = new javax.swing.JLabel();
        Panel_Recuperar_Contraseña = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtCorreoRecuperar = new javax.swing.JTextField();
        Panel_Enviar_Correo = new javax.swing.JPanel();
        Label_Enviar_Correo = new javax.swing.JLabel();
        Panel_Iniciar_Sesión = new javax.swing.JPanel();
        Label_Iniciar_Sesión = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Panel_Exit_Recuperar_Contraseña = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondodegradado_1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Recuperar_Contraseña.setBackground(new java.awt.Color(0, 0, 0));
        Panel_Recuperar_Contraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel1.setText("Recuperar contraseña");
        Panel_Recuperar_Contraseña.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Favor digite su correo electrónico para recuperar su contraseña");
        Panel_Recuperar_Contraseña.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        TxtCorreoRecuperar.setBackground(new java.awt.Color(171, 204, 234));
        TxtCorreoRecuperar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        TxtCorreoRecuperar.setForeground(new java.awt.Color(153, 153, 153));
        TxtCorreoRecuperar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCorreoRecuperar.setText("Correo");
        TxtCorreoRecuperar.setBorder(null);
        TxtCorreoRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtCorreoRecuperarMousePressed(evt);
            }
        });
        TxtCorreoRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoRecuperarActionPerformed(evt);
            }
        });
        Panel_Recuperar_Contraseña.add(TxtCorreoRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 300, -1));

        Panel_Enviar_Correo.setBackground(new java.awt.Color(91, 155, 213));
        Panel_Enviar_Correo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Enviar_Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Enviar_CorreoMouseClicked(evt);
            }
        });

        Label_Enviar_Correo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Label_Enviar_Correo.setForeground(new java.awt.Color(255, 255, 255));
        Label_Enviar_Correo.setText("Enviar correo");

        javax.swing.GroupLayout Panel_Enviar_CorreoLayout = new javax.swing.GroupLayout(Panel_Enviar_Correo);
        Panel_Enviar_Correo.setLayout(Panel_Enviar_CorreoLayout);
        Panel_Enviar_CorreoLayout.setHorizontalGroup(
            Panel_Enviar_CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Enviar_CorreoLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(Label_Enviar_Correo)
                .addGap(20, 20, 20))
        );
        Panel_Enviar_CorreoLayout.setVerticalGroup(
            Panel_Enviar_CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Enviar_CorreoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Enviar_Correo)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Panel_Recuperar_Contraseña.add(Panel_Enviar_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        Panel_Iniciar_Sesión.setBackground(new java.awt.Color(91, 155, 213));
        Panel_Iniciar_Sesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Iniciar_Sesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Iniciar_SesiónMouseClicked(evt);
            }
        });

        Label_Iniciar_Sesión.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Label_Iniciar_Sesión.setForeground(new java.awt.Color(255, 255, 255));
        Label_Iniciar_Sesión.setText("Iniciar sesión");

        javax.swing.GroupLayout Panel_Iniciar_SesiónLayout = new javax.swing.GroupLayout(Panel_Iniciar_Sesión);
        Panel_Iniciar_Sesión.setLayout(Panel_Iniciar_SesiónLayout);
        Panel_Iniciar_SesiónLayout.setHorizontalGroup(
            Panel_Iniciar_SesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Iniciar_SesiónLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Label_Iniciar_Sesión)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Panel_Iniciar_SesiónLayout.setVerticalGroup(
            Panel_Iniciar_SesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Iniciar_SesiónLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Label_Iniciar_Sesión)
                .addContainerGap())
        );

        Panel_Recuperar_Contraseña.add(Panel_Iniciar_Sesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));
        Panel_Recuperar_Contraseña.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 185, 292, 10));

        Panel_Exit_Recuperar_Contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Exit_Recuperar_Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Exit_Recuperar_ContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_Exit_Recuperar_ContraseñaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_Exit_Recuperar_ContraseñaMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Exit_Recuperar_ContraseñaLayout = new javax.swing.GroupLayout(Panel_Exit_Recuperar_Contraseña);
        Panel_Exit_Recuperar_Contraseña.setLayout(Panel_Exit_Recuperar_ContraseñaLayout);
        Panel_Exit_Recuperar_ContraseñaLayout.setHorizontalGroup(
            Panel_Exit_Recuperar_ContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Exit_Recuperar_ContraseñaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        Panel_Exit_Recuperar_ContraseñaLayout.setVerticalGroup(
            Panel_Exit_Recuperar_ContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Exit_Recuperar_ContraseñaLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        Panel_Recuperar_Contraseña.add(Panel_Exit_Recuperar_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondodegradado_1.png"))); // NOI18N
        Panel_Recuperar_Contraseña.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Recuperar_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Recuperar_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_Enviar_CorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Enviar_CorreoMouseClicked
        try {           
            
            Login L = new Login();

            EnvioCorreos C = new EnvioCorreos(TxtCorreoRecuperar.getText(), L.TxtNombre.getText(), L.TxtContraseñaLogin.getText());
            C.Envio_de_Correos_Recuperar_Contraseña();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error, verifique sus datos");
        }
    }//GEN-LAST:event_Panel_Enviar_CorreoMouseClicked

    private void Panel_Iniciar_SesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Iniciar_SesiónMouseClicked
        Ingreso I = new Ingreso();
        I.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Panel_Iniciar_SesiónMouseClicked

    private void TxtCorreoRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoRecuperarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreoRecuperarActionPerformed

    private void TxtCorreoRecuperarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtCorreoRecuperarMousePressed
        TxtCorreoRecuperar.setText("");
        TxtCorreoRecuperar.setForeground(Color.black);
    }//GEN-LAST:event_TxtCorreoRecuperarMousePressed

    private void Panel_Exit_Recuperar_ContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Exit_Recuperar_ContraseñaMouseClicked
        
        
        
    }//GEN-LAST:event_Panel_Exit_Recuperar_ContraseñaMouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        Panel_Exit_Recuperar_Contraseña.setBackground(Color.red);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void Panel_Exit_Recuperar_ContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Exit_Recuperar_ContraseñaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Panel_Exit_Recuperar_ContraseñaMousePressed

    private void Panel_Exit_Recuperar_ContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Exit_Recuperar_ContraseñaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_Exit_Recuperar_ContraseñaMouseEntered

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

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
            java.util.logging.Logger.getLogger(Recuperar_Contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recuperar_Contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recuperar_Contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recuperar_Contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recuperar_Contraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Enviar_Correo;
    private javax.swing.JLabel Label_Iniciar_Sesión;
    private javax.swing.JPanel Panel_Enviar_Correo;
    private javax.swing.JPanel Panel_Exit_Recuperar_Contraseña;
    private javax.swing.JPanel Panel_Iniciar_Sesión;
    private javax.swing.JPanel Panel_Recuperar_Contraseña;
    private javax.swing.JTextField TxtCorreoRecuperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
