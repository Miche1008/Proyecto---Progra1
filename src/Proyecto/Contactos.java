/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miche
 */
public class Contactos extends javax.swing.JFrame {

    private int yMouse;
    private int xMouse;
    String usuario;

    /**
     * Creates new form Contactos
     */
    
    public Contactos(){
        initComponents();    
    }
    
    public Contactos(String usuario){
        this.usuario = usuario;

        initComponents();
        
        Label_Usuario_Contactos.setText(usuario);
        
        if (Login.rol == "Administrador") {
            PanelAdministardor.setVisible(true);
            LabelReporte.setVisible(true);
            Panel_Ir_A_Reportes.setVisible(true);
            
        }else{
            PanelAdministardor.setVisible(false);
            LabelReporte.setVisible(false);
            Panel_Ir_A_Reportes.setVisible(false);           
        }       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PanelContactos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabelReporte = new javax.swing.JLabel();
        Panel_Ir_A_Reportes = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PanelAdministardor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Panel_Contactos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Label_Usuario_Contactos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondodegradado.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondodegradado_1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contactos");

        PanelContactos.setForeground(new java.awt.Color(204, 204, 204));
        PanelContactos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Presione el contacto para iniciar la conversación");
        PanelContactos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        LabelReporte.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        LabelReporte.setText("Si deseas generar un reporte, presione \"Ir a reportes\".");
        PanelContactos.add(LabelReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        Panel_Ir_A_Reportes.setBackground(new java.awt.Color(91, 155, 213));
        Panel_Ir_A_Reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Ir_A_Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Ir_A_ReportesMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ir a reportes");

        javax.swing.GroupLayout Panel_Ir_A_ReportesLayout = new javax.swing.GroupLayout(Panel_Ir_A_Reportes);
        Panel_Ir_A_Reportes.setLayout(Panel_Ir_A_ReportesLayout);
        Panel_Ir_A_ReportesLayout.setHorizontalGroup(
            Panel_Ir_A_ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Ir_A_ReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_Ir_A_ReportesLayout.setVerticalGroup(
            Panel_Ir_A_ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Ir_A_ReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelContactos.add(Panel_Ir_A_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 97, -1));

        PanelAdministardor.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Perfil administrador");

        javax.swing.GroupLayout PanelAdministardorLayout = new javax.swing.GroupLayout(PanelAdministardor);
        PanelAdministardor.setLayout(PanelAdministardorLayout);
        PanelAdministardorLayout.setHorizontalGroup(
            PanelAdministardorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdministardorLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        PanelAdministardorLayout.setVerticalGroup(
            PanelAdministardorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdministardorLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        PanelContactos.add(PanelAdministardor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 344, 410, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Lista de contactos3.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        PanelContactos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 54));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel6.setText("Lista de contactos");
        PanelContactos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 25, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_ContactosLayout = new javax.swing.GroupLayout(Panel_Contactos);
        Panel_Contactos.setLayout(Panel_ContactosLayout);
        Panel_ContactosLayout.setHorizontalGroup(
            Panel_ContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_ContactosLayout.setVerticalGroup(
            Panel_ContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ContactosLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        PanelContactos.add(Panel_Contactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        Label_Usuario_Contactos.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        Label_Usuario_Contactos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Usuario_Contactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_Usuario_ContactosMouseClicked(evt);
            }
        });
        PanelContactos.add(Label_Usuario_Contactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondodegradado_1.png"))); // NOI18N
        PanelContactos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContactos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel_Ir_A_ReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Ir_A_ReportesMouseClicked

        Reportes R;
        try {
            R = new Reportes();
            R.setVisible(true);
        this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Contactos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Panel_Ir_A_ReportesMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        System.exit(0);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        
        Panel_Contactos.setBackground(Color.red);
        
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
       
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_jLabel7MouseDragged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Label_Usuario_ContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_Usuario_ContactosMouseClicked
        
        new FastChat(Label_Usuario_Contactos.getText()).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Label_Usuario_ContactosMouseClicked

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
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LabelReporte;
    private javax.swing.JLabel Label_Usuario_Contactos;
    public static javax.swing.JPanel PanelAdministardor;
    private javax.swing.JPanel PanelContactos;
    private javax.swing.JPanel Panel_Contactos;
    public static javax.swing.JPanel Panel_Ir_A_Reportes;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    }