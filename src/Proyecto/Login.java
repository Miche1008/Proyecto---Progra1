/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Session;
import javax.mail.internet.MimeBodyPart;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miche
 */
public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public static ArrayList<Usuarios> ArrayUsuarios = new ArrayList<Usuarios>();

    public static String rol;

    public Login(){
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtUsuarioLogin = new javax.swing.JTextField();
        TxtContraseñaLogin = new javax.swing.JPasswordField();
        VerContraseña2 = new javax.swing.JCheckBox();
        PanelExitRegistro = new javax.swing.JPanel();
        LabelExitIngreso = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtApellidos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        radioadministrador = new javax.swing.JRadioButton();
        radiousuario = new javax.swing.JRadioButton();
        PanelCrearUsuario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelIniciarSesión = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel1.setText("Registre su nuevo usuario");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 190, -1));

        TxtUsuarioLogin.setBackground(new java.awt.Color(197, 219, 240));
        TxtUsuarioLogin.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        TxtUsuarioLogin.setForeground(new java.awt.Color(102, 102, 102));
        TxtUsuarioLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtUsuarioLogin.setText("Usuario");
        TxtUsuarioLogin.setBorder(null);
        TxtUsuarioLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtUsuarioLoginMousePressed(evt);
            }
        });
        jPanel3.add(TxtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 220, -1));

        TxtContraseñaLogin.setBackground(new java.awt.Color(214, 229, 244));
        TxtContraseñaLogin.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        TxtContraseñaLogin.setForeground(new java.awt.Color(102, 102, 102));
        TxtContraseñaLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtContraseñaLogin.setText("*****");
        TxtContraseñaLogin.setBorder(null);
        TxtContraseñaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtContraseñaLoginMousePressed(evt);
            }
        });
        jPanel3.add(TxtContraseñaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 220, -1));

        VerContraseña2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        VerContraseña2.setText("Visualizar contraseña");
        VerContraseña2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VerContraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerContraseña2ActionPerformed(evt);
            }
        });
        jPanel3.add(VerContraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 150, -1));

        PanelExitRegistro.setBackground(new java.awt.Color(124, 174, 220));
        PanelExitRegistro.setForeground(new java.awt.Color(255, 255, 255));
        PanelExitRegistro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PanelExitRegistroMouseMoved(evt);
            }
        });
        PanelExitRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelExitRegistroMouseExited(evt);
            }
        });

        LabelExitIngreso.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        LabelExitIngreso.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout PanelExitRegistroLayout = new javax.swing.GroupLayout(PanelExitRegistro);
        PanelExitRegistro.setLayout(PanelExitRegistroLayout);
        PanelExitRegistroLayout.setHorizontalGroup(
            PanelExitRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExitRegistroLayout.createSequentialGroup()
                .addComponent(LabelExitIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        PanelExitRegistroLayout.setVerticalGroup(
            PanelExitRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelExitRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelExitIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(PanelExitRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 40, 40));

        TxtNombre.setBackground(new java.awt.Color(136, 182, 224));
        TxtNombre.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(102, 102, 102));
        TxtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNombre.setText("Nombre");
        TxtNombre.setBorder(null);
        TxtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtNombreMousePressed(evt);
            }
        });
        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        jPanel3.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 220, -1));

        TxtCorreo.setBackground(new java.awt.Color(177, 207, 235));
        TxtCorreo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        TxtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        TxtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCorreo.setText("Correo electrónico");
        TxtCorreo.setBorder(null);
        TxtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtCorreoMousePressed(evt);
            }
        });
        jPanel3.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 220, -1));

        TxtApellidos.setBackground(new java.awt.Color(155, 194, 229));
        TxtApellidos.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        TxtApellidos.setForeground(new java.awt.Color(102, 102, 102));
        TxtApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtApellidos.setText("Apellidos");
        TxtApellidos.setBorder(null);
        TxtApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtApellidosMousePressed(evt);
            }
        });
        TxtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidosActionPerformed(evt);
            }
        });
        jPanel3.add(TxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 220, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 102, 220, 40));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 162, 220, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 232, 220, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 302, 220, -1));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 372, 220, 10));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione su perfil de usuario:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        buttonGroup1.add(radioadministrador);
        radioadministrador.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        radioadministrador.setText("Adminisistrador");
        radioadministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioadministradorActionPerformed(evt);
            }
        });
        jPanel3.add(radioadministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        buttonGroup1.add(radiousuario);
        radiousuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        radiousuario.setText("Usuario estándar");
        jPanel3.add(radiousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        PanelCrearUsuario.setBackground(new java.awt.Color(91, 155, 213));
        PanelCrearUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelCrearUsuarioMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crear usuario");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelCrearUsuarioLayout = new javax.swing.GroupLayout(PanelCrearUsuario);
        PanelCrearUsuario.setLayout(PanelCrearUsuarioLayout);
        PanelCrearUsuarioLayout.setHorizontalGroup(
            PanelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCrearUsuarioLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        PanelCrearUsuarioLayout.setVerticalGroup(
            PanelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCrearUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(PanelCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 110, 40));

        PanelIniciarSesión.setBackground(new java.awt.Color(91, 155, 213));
        PanelIniciarSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelIniciarSesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelIniciarSesiónMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Iniciar sesión");

        javax.swing.GroupLayout PanelIniciarSesiónLayout = new javax.swing.GroupLayout(PanelIniciarSesión);
        PanelIniciarSesión.setLayout(PanelIniciarSesiónLayout);
        PanelIniciarSesiónLayout.setHorizontalGroup(
            PanelIniciarSesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIniciarSesiónLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        PanelIniciarSesiónLayout.setVerticalGroup(
            PanelIniciarSesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIniciarSesiónLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(PanelIniciarSesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 110, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondodegradado.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 590));

        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jLabel7.setText("X");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 20, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerContraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerContraseña2ActionPerformed

        if (VerContraseña2.isSelected()) {
            TxtContraseñaLogin.setEchoChar((char) 0);
        } else {
            TxtContraseñaLogin.setEchoChar('*');
        }

    }//GEN-LAST:event_VerContraseña2ActionPerformed

    private void LabelExitIngresoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_LabelExitIngresoMousePressed

    private void LabelExitIngresoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_LabelExitIngresoMouseDragged

    private void LabelExitIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LabelExitIngresoMouseClicked

    private void LabelExitIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMouseEntered
        PanelExitRegistro.setBackground(Color.red);

    }//GEN-LAST:event_LabelExitIngresoMouseEntered

    private void LabelExitIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitIngresoMouseExited

    }//GEN-LAST:event_LabelExitIngresoMouseExited

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed

    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNombreMousePressed
        TxtNombre.setText("");
        TxtNombre.setForeground(Color.black);
    }//GEN-LAST:event_TxtNombreMousePressed

    private void TxtApellidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtApellidosMousePressed
        TxtApellidos.setText("");
        TxtApellidos.setForeground(Color.black);
    }//GEN-LAST:event_TxtApellidosMousePressed

    private void TxtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtCorreoMousePressed
        TxtCorreo.setText("");
        TxtCorreo.setForeground(Color.black);
    }//GEN-LAST:event_TxtCorreoMousePressed

    private void TxtUsuarioLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioLoginMousePressed
        TxtUsuarioLogin.setText("");
        TxtUsuarioLogin.setForeground(Color.black);
    }//GEN-LAST:event_TxtUsuarioLoginMousePressed

    private void TxtContraseñaLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraseñaLoginMousePressed
        TxtContraseñaLogin.setText("");
        TxtContraseñaLogin.setForeground(Color.black);
    }//GEN-LAST:event_TxtContraseñaLoginMousePressed

    private void radioadministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioadministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioadministradorActionPerformed

    private void TxtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidosActionPerformed

    private void PanelCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCrearUsuarioMouseClicked
        try {
            String rol = "";
            if (radioadministrador.isSelected()) {
                rol = "1";
            } else if (radiousuario.isSelected()) {
                rol = "2";
            }

            Usuarios U = new Usuarios(TxtUsuarioLogin.getText(), TxtContraseñaLogin.getText(), TxtNombre.getText(), TxtApellidos.getText(), TxtCorreo.getText(), rol);

            ArrayUsuarios.add(U);

            Icono icon = new Icono();
            JOptionPane.showMessageDialog(rootPane, "Usuario creado correctamente", "FastChat - Creación de usuario", JOptionPane.DEFAULT_OPTION, icon);

            EnvioCorreos C = new EnvioCorreos(TxtCorreo.getText(), TxtNombre.getText(), TxtUsuarioLogin.getText(), TxtContraseñaLogin.getText());
            C.Envio_de_Correos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error, verifique sus datos");
        }

    }//GEN-LAST:event_PanelCrearUsuarioMouseClicked


    private void PanelIniciarSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelIniciarSesiónMouseClicked
        Ingreso I = new Ingreso();
        I.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PanelIniciarSesiónMouseClicked

    private void PanelExitRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelExitRegistroMouseExited
        PanelExitRegistro.setBackground(Color.blue);
    }//GEN-LAST:event_PanelExitRegistroMouseExited

    private void PanelExitRegistroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelExitRegistroMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelExitRegistroMouseMoved

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelExitIngreso;
    private javax.swing.JPanel PanelCrearUsuario;
    private javax.swing.JPanel PanelExitRegistro;
    private javax.swing.JPanel PanelIniciarSesión;
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JPasswordField TxtContraseñaLogin;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtUsuarioLogin;
    private javax.swing.JCheckBox VerContraseña2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton radioadministrador;
    private javax.swing.JRadioButton radiousuario;
    // End of variables declaration//GEN-END:variables
}
