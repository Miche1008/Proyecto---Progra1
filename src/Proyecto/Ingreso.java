/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import static Proyecto.FastChat.S;
import static Proyecto.FastChat.Text_Area_Mensaje;
import static Proyecto.FastChat.entrada;
import static Proyecto.FastChat.salida;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miche
 */
public class Ingreso extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    /**
     * Creates new form Ingreso
     */
    public Ingreso() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JPasswordField();
        VerContraseña1 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        PanelExitIngreso = new javax.swing.JPanel();
        LabelExitIngreso = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PanelIngresar = new javax.swing.JPanel();
        LabelIngresar = new javax.swing.JLabel();
        PanelOlvidarContraseña = new javax.swing.JPanel();
        LabelOlvidarContraseña = new javax.swing.JLabel();
        PanelRegistrarse = new javax.swing.JPanel();
        LabelRegistrarse = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("FastChat");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        TxtUsuario.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        TxtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtUsuario.setText("Ingrese su usuario");
        TxtUsuario.setBorder(null);
        TxtUsuario.setSelectedTextColor(new java.awt.Color(51, 204, 255));
        TxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtUsuarioMousePressed(evt);
            }
        });
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 230, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel4.setText("Si aún no tienes usuario, presiona el botón de \"Registrarse\".");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 453, 18));

        TxtContraseña.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        TxtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        TxtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtContraseña.setText("**********");
        TxtContraseña.setBorder(null);
        TxtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtContraseñaMousePressed(evt);
            }
        });
        jPanel1.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, -1));

        VerContraseña1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        VerContraseña1.setText("Visualizar contraseña");
        VerContraseña1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerContraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerContraseña11ActionPerformed(evt);
            }
        });
        jPanel1.add(VerContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 230, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 230, 10));

        PanelExitIngreso.setBackground(new java.awt.Color(255, 255, 255));
        PanelExitIngreso.setForeground(new java.awt.Color(255, 255, 255));

        LabelExitIngreso.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        LabelExitIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelExitIngreso.setText("X");
        LabelExitIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelExitIngreso.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LabelExitIngresoMouseDragged(evt);
            }
        });
        LabelExitIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelExitIngresoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelExitIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelExitIngresoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LabelExitIngresoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelExitIngresoLayout = new javax.swing.GroupLayout(PanelExitIngreso);
        PanelExitIngreso.setLayout(PanelExitIngresoLayout);
        PanelExitIngresoLayout.setHorizontalGroup(
            PanelExitIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExitIngresoLayout.createSequentialGroup()
                .addComponent(LabelExitIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        PanelExitIngresoLayout.setVerticalGroup(
            PanelExitIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelExitIngresoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelExitIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(PanelExitIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 40, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Logo 3.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 50));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jLabel5.setText("¿Olvidaste tu contraseña? Presiona el siguiente botón");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        PanelIngresar.setBackground(new java.awt.Color(91, 155, 213));
        PanelIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelIngresarMouseClicked(evt);
            }
        });

        LabelIngresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        LabelIngresar.setForeground(new java.awt.Color(255, 255, 255));
        LabelIngresar.setText("Ingresar");

        javax.swing.GroupLayout PanelIngresarLayout = new javax.swing.GroupLayout(PanelIngresar);
        PanelIngresar.setLayout(PanelIngresarLayout);
        PanelIngresarLayout.setHorizontalGroup(
            PanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LabelIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelIngresarLayout.setVerticalGroup(
            PanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PanelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 100, 40));

        PanelOlvidarContraseña.setBackground(new java.awt.Color(91, 155, 213));
        PanelOlvidarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelOlvidarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelOlvidarContraseñaMouseClicked(evt);
            }
        });

        LabelOlvidarContraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        LabelOlvidarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LabelOlvidarContraseña.setText("Olvidé mi contraseña");

        javax.swing.GroupLayout PanelOlvidarContraseñaLayout = new javax.swing.GroupLayout(PanelOlvidarContraseña);
        PanelOlvidarContraseña.setLayout(PanelOlvidarContraseñaLayout);
        PanelOlvidarContraseñaLayout.setHorizontalGroup(
            PanelOlvidarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOlvidarContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOlvidarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelOlvidarContraseñaLayout.setVerticalGroup(
            PanelOlvidarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOlvidarContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelOlvidarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PanelOlvidarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 150, 40));

        PanelRegistrarse.setBackground(new java.awt.Color(91, 155, 213));
        PanelRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelRegistrarseMouseClicked(evt);
            }
        });

        LabelRegistrarse.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        LabelRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        LabelRegistrarse.setText("Registrarse");

        javax.swing.GroupLayout PanelRegistrarseLayout = new javax.swing.GroupLayout(PanelRegistrarse);
        PanelRegistrarse.setLayout(PanelRegistrarseLayout);
        PanelRegistrarseLayout.setHorizontalGroup(
            PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelRegistrarseLayout.setVerticalGroup(
            PanelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(PanelRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 100, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FONDO2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 390, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void VerContraseña11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerContraseña11ActionPerformed
        if (VerContraseña1.isSelected()) {
            TxtContraseña.setEchoChar((char)0);
        }
        else{
            TxtContraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_VerContraseña11ActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMousePressed
        TxtUsuario.setText("");
        TxtUsuario.setForeground(Color.black);
    }//GEN-LAST:event_TxtUsuarioMousePressed

    private void TxtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaMousePressed
        TxtContraseña.setText("");
        TxtContraseña.setForeground(Color.black);
    }//GEN-LAST:event_TxtContraseñaMousePressed

    private void LabelExitIngresoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_LabelExitIngresoMouseDragged

    private void LabelExitIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LabelExitIngresoMouseClicked

    private void LabelExitIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMouseEntered
        PanelExitIngreso.setBackground(Color.red);

    }//GEN-LAST:event_LabelExitIngresoMouseEntered

    private void LabelExitIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMouseExited
        PanelExitIngreso.setBackground(Color.white);

    }//GEN-LAST:event_LabelExitIngresoMouseExited

    private void LabelExitIngresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_LabelExitIngresoMousePressed

    private void PanelIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelIngresarMouseClicked

        String usuario = TxtUsuario.getText();
        String contraseña = TxtContraseña.getText();
        
        boolean encontrar = false;
        
        for (int i = 0; i < Login.ArrayUsuarios.size() ; i++) {
            if (Login.ArrayUsuarios.get(i).getUsuario().equals(usuario) && Login.ArrayUsuarios.get(i).getContraseña().equals(contraseña)) {
               encontrar = true;
               Login.rol = Login.ArrayUsuarios.get(i).getRol();
               break;
            }else{  
               encontrar= false;
        }           
           
    }                                             
if (encontrar) {
    JOptionPane.showMessageDialog(rootPane, "Bienvenido a Fastchat");
    new Contactos(TxtUsuario.getText()).setVisible(true);   
    this.dispose();
    
}else{
    JOptionPane.showMessageDialog(rootPane, "Informacion incorrecta, por favor verifique su usuario y contraseña");
    Ingreso I = new Ingreso();
    I.setVisible(true);
    this.dispose();
}
    }//GEN-LAST:event_PanelIngresarMouseClicked

    private void PanelOlvidarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelOlvidarContraseñaMouseClicked
        Recuperar_Contraseña R = new Recuperar_Contraseña();
        R.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PanelOlvidarContraseñaMouseClicked

    private void PanelRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelRegistrarseMouseClicked
        Login L = new Login();
        L.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PanelRegistrarseMouseClicked

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
        
        try {

            S = new Socket("192.168.0.111", 4444);
            entrada = new DataInputStream(S.getInputStream());
            salida = new DataOutputStream(S.getOutputStream());

            String mensaje = "";

            while (!mensaje.equals("Exit")) {

                mensaje = entrada.readUTF();
                Text_Area_Mensaje.setText(Text_Area_Mensaje.getText().trim() + "\n" + "\nLuilli: " + mensaje + "\n");
            }

        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelExitIngreso;
    private javax.swing.JLabel LabelIngresar;
    private javax.swing.JLabel LabelOlvidarContraseña;
    private javax.swing.JLabel LabelRegistrarse;
    private javax.swing.JPanel PanelExitIngreso;
    private javax.swing.JPanel PanelIngresar;
    private javax.swing.JPanel PanelOlvidarContraseña;
    private javax.swing.JPanel PanelRegistrarse;
    private javax.swing.JPasswordField TxtContraseña;
    public static javax.swing.JTextField TxtUsuario;
    private javax.swing.JCheckBox VerContraseña1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}




