package Proyecto;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.net.ssl.SSLSession;
import javax.swing.JOptionPane;

public class EnvioCorreos {

    Login L = new Login();

    static final String FROM = "mensajeria.fastchat@gmail.com";
    static final String FROMNAME = "FastChat";

    private String TO;
    private String nombre;
    private String usuario;
    private String contraseña;
    ArrayList<Usuarios> ArrayUsuarios;
    

    public EnvioCorreos(String TO, String nombre, String usuario, String contraseña) {
        this.TO = TO;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public EnvioCorreos(String TO, String nombre, String contraseña, ArrayList<Usuarios> ArrayUsuarios) {
        this.TO = TO;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.ArrayUsuarios = ArrayUsuarios;
    }

    static final String SMTP_USERMANE = "mensajeria.fastchat@gmail.com";
    static final String SMTP_PASSWORD = "FastChat321456";

    static final String CONFIGSET = "ConfigSet";

    static final String HOST = "smtp.gmail.com";

    static final int PORT = 587;

    static final String SUBJECT = "Bienvenida";

    static final String SUBJECT2 = "Recuperación de contraseña";

    String BODY = (", bienvenido a FastChat, ");

    String BODY2 = (", su contraseña es: ");

    public void Envio_de_Correos() throws UnsupportedEncodingException, MessagingException {

        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getDefaultInstance(props);

        MimeMessage mg = new MimeMessage(session);
        mg.setFrom(new InternetAddress(FROM, FROMNAME));
        mg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        mg.setSubject(SUBJECT);
        mg.setContent("Hola " + nombre + BODY + " su usuario es: " + usuario + " y su contraseña es: " + contraseña, "text/html");

        mg.setHeader("X-SES-CONFIGURARTION-SET", CONFIGSET);

        Transport transport = session.getTransport();
        System.out.println(TO);

        JOptionPane.showMessageDialog(null, "Por favor espere, estamos validando su correo electrónico.");

        try {
            transport.connect(HOST, SMTP_USERMANE, SMTP_PASSWORD);
            transport.sendMessage(mg, mg.getAllRecipients());
            JOptionPane.showMessageDialog(null, "Correo de validación enviado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            System.out.println(e.getMessage());
        } finally {
            transport.close();
        }

    }

    public void Envio_de_Correos_Recuperar_Contraseña() throws MessagingException, UnsupportedEncodingException {

        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getDefaultInstance(props);

        MimeMessage mg = new MimeMessage(session);
        mg.setFrom(new InternetAddress(FROM, FROMNAME));
        mg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        mg.setSubject(SUBJECT2);
        mg.setContent("Hola " + nombre + BODY2  + contraseña, "text/html");

        mg.setHeader("X-SES-CONFIGURARTION-SET", CONFIGSET);

        Transport transport = session.getTransport();
        System.out.println(TO);

        JOptionPane.showMessageDialog(null, "Por favor espere, estamos validando su correo electrónico.");

        try {
            transport.connect(HOST, SMTP_USERMANE, SMTP_PASSWORD);
            transport.sendMessage(mg, mg.getAllRecipients());
            JOptionPane.showMessageDialog(null, "Se ha enviado un correo con su respectiva contraseña.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            System.out.println(e.getMessage());
        } finally {
            transport.close();
        }

    }

}
