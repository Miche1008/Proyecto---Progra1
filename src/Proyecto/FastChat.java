
package Proyecto;

import java.awt.Color;
import java.net.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FastChat extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    String usuario;
    static Socket S;
    static DataInputStream entrada;
    static DataOutputStream salida;

    public FastChat(){
    initComponents();
}
    
    public FastChat(String usuario) {
        this.usuario = usuario;
        
        initComponents();
        
        BotónUsuarioFastChat.setText(usuario);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Text_Area_Mensaje = new javax.swing.JTextArea();
        PanelExitFastChat = new javax.swing.JPanel();
        LabelExitFastChat = new javax.swing.JLabel();
        Panel_FastChat = new javax.swing.JPanel();
        BotónUsuarioFastChat = new javax.swing.JButton();
        BotónAtrásFastChat = new javax.swing.JButton();
        BotónEnviarFastChat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Text_Area_Envío_Mensajes = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FastChat");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text_Area_Mensaje.setEditable(false);
        Text_Area_Mensaje.setColumns(20);
        Text_Area_Mensaje.setRows(5);
        jScrollPane2.setViewportView(Text_Area_Mensaje);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 670, 250));

        PanelExitFastChat.setForeground(new java.awt.Color(255, 255, 255));

        LabelExitFastChat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelExitFastChat.setForeground(new java.awt.Color(255, 255, 255));
        LabelExitFastChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelExitFastChat.setText("X");
        LabelExitFastChat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelExitFastChat.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LabelExitFastChatMouseDragged(evt);
            }
        });
        LabelExitFastChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelExitFastChatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelExitFastChatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelExitFastChatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LabelExitFastChatMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelExitFastChatLayout = new javax.swing.GroupLayout(PanelExitFastChat);
        PanelExitFastChat.setLayout(PanelExitFastChatLayout);
        PanelExitFastChatLayout.setHorizontalGroup(
            PanelExitFastChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelExitFastChatLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(LabelExitFastChat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelExitFastChatLayout.setVerticalGroup(
            PanelExitFastChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelExitFastChatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelExitFastChat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(PanelExitFastChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 40, 40));

        Panel_FastChat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotónUsuarioFastChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónUsuarioFastChatActionPerformed(evt);
            }
        });
        Panel_FastChat.add(BotónUsuarioFastChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 90, 35));

        BotónAtrásFastChat.setText("Atrás");
        BotónAtrásFastChat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotónAtrásFastChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónAtrásFastChatActionPerformed(evt);
            }
        });
        Panel_FastChat.add(BotónAtrásFastChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 77, -1));

        BotónEnviarFastChat.setText("Enviar");
        BotónEnviarFastChat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotónEnviarFastChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónEnviarFastChatActionPerformed(evt);
            }
        });
        Panel_FastChat.add(BotónEnviarFastChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 84, -1));

        jScrollPane1.setViewportView(Text_Area_Envío_Mensajes);

        Panel_FastChat.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 670, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Fondodegradado_1.png"))); // NOI18N
        Panel_FastChat.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 560));

        getContentPane().add(Panel_FastChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotónEnviarFastChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónEnviarFastChatActionPerformed
        
        try {
                     
            Date Fecha = new Date(); 
            SimpleDateFormat FormatoFechaSimple = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
            
            String mensaje = this.Text_Area_Envío_Mensajes.getText() + "\n" + "Fecha: " + FormatoFechaSimple.format(Fecha) + "\n";
            salida.writeUTF(mensaje);
            this.Text_Area_Mensaje.append(mensaje);
                        
        } catch (Exception e) {
            Logger.getLogger(FastChat.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }//GEN-LAST:event_BotónEnviarFastChatActionPerformed

    private void BotónAtrásFastChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónAtrásFastChatActionPerformed
        
        Contactos Co = new Contactos();
        Co.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotónAtrásFastChatActionPerformed

    private void LabelExitFastChatMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitFastChatMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_LabelExitFastChatMouseDragged

    private void LabelExitFastChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitFastChatMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LabelExitFastChatMouseClicked

    private void LabelExitFastChatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitFastChatMouseEntered
        PanelExitFastChat.setBackground(Color.red);
    }//GEN-LAST:event_LabelExitFastChatMouseEntered

    private void LabelExitFastChatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitFastChatMouseExited
        PanelExitFastChat.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_LabelExitFastChatMouseExited

    private void LabelExitFastChatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitFastChatMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_LabelExitFastChatMousePressed

    private void BotónUsuarioFastChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónUsuarioFastChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotónUsuarioFastChatActionPerformed

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
            java.util.logging.Logger.getLogger(FastChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastChat().setVisible(true);
            }
        });
        
        try {

            S = new Socket ("192.168.0.103", 4444);
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
    private javax.swing.JButton BotónAtrásFastChat;
    private javax.swing.JButton BotónEnviarFastChat;
    private javax.swing.JButton BotónUsuarioFastChat;
    private javax.swing.JLabel LabelExitFastChat;
    private javax.swing.JPanel PanelExitFastChat;
    private javax.swing.JPanel Panel_FastChat;
    static javax.swing.JTextPane Text_Area_Envío_Mensajes;
    static javax.swing.JTextArea Text_Area_Mensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
