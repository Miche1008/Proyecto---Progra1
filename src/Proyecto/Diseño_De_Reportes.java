package Proyecto;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Diseño_De_Reportes {

    String nombreDocumento;
    String fecha;
    String rutaImagen;
    ArrayList<Usuarios> ArrayUsuarios;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Diseño_De_Reportes(String nombreDocumento, String fecha, String rutaImagen, ArrayList<Usuarios> ArrayUsuarios) {
        this.nombreDocumento = nombreDocumento;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        this.ArrayUsuarios = ArrayUsuarios;

        documento = new Document();
        titulo = new Paragraph("Reporte - Usuarios");
    }

    public Diseño_De_Reportes(String nombreDocumento, String fecha, String rutaImagen) {
        this.nombreDocumento = nombreDocumento;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;

        documento = new Document();
        titulo = new Paragraph("Reporte - Creación de FastChat");
    }

    public void Generar_Reporte_FastChat() {

        try {

            archivo = new FileOutputStream(nombreDocumento + ".pdf");

            PdfWriter.getInstance(documento, archivo);

            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);

            Image imagen = null;

            try {

                imagen = Image.getInstance(rutaImagen);
                imagen.scaleAbsolute(100, 100);
                imagen.setAbsolutePosition(485, 730);

            } catch (Exception e) {
            }

            documento.add(imagen);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Reseña del programa:"));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Nuestro proyecto se encuentra enfocado en un software desarrollado en un ambiente local, con las funciones básicas de la mensajería instantánea, en la cual se pueda realizar tares para facilitar la comunicación en un determinado lugar de trabajo, favoreciendo así a los usuarios finales, ya que contaran con una herramienta muy fácil de utilizar y que les proporcionara una serie de ventajas a todas aquellas entidades u organizaciones que se encuentren buscando grandes resultados, gracias a su alta fiabilidad y seguridad en la transmisión de los datos."));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Características:"));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("1- Velocidad.\n" + "2- Amigable con el usuario.\n" + "3- Capacidad de desarrollar diferentes funcionalidades dependiendo de la necesidad del usuario “Solicitues de mejora”.\n" + "4- FastChat viene a darnos todas las soluciones y herramientas necesarias para poder tener una comunicación rápida y eficaz."));
            documento.add(Chunk.NEWLINE);

            documento.add(new Paragraph("Si quiere conocer sobre el nombre y el logo, escanea el siguiente código QR"));
            BarcodeQRCode códigoqr = new BarcodeQRCode("El nombre del software proviene de la derivación de dos palabras; la primera es fast: palabra escrita en inglés que traducida al español obtenemos el significado de rápido o veloz, complementado por la palabra chat, que básicamente significa intercambiar mensajes a través de internet y que a su vez permite realizar una conversación entre dos o más personas. El nombre de FastChat nos indica tener un software de mensajería instantánea en la cual podemos chatear de una manera rápida.", 1, 1, null);
            Image imagenqr = códigoqr.getImage();
            imagenqr.scalePercent(200);
            documento.add(imagenqr);

            Date Fecha = new Date();

            SimpleDateFormat FormatoFechaSimple = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

            documento.add(new Paragraph("Fecha: " + FormatoFechaSimple.format(Fecha)));

            documento.close();

            JOptionPane.showMessageDialog(null, "Su reporte ha sido creado");

        } catch (Exception e) {
        }

    }

    public void Generar_Reporte_Usuarios() {

        try {

            archivo = new FileOutputStream(nombreDocumento + ".pdf");

            PdfWriter.getInstance(documento, archivo);

            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);

            Image imagen = null;

            try {

                imagen = Image.getInstance(rutaImagen);
                imagen.scaleAbsolute(100, 100);
                imagen.setAbsolutePosition(485, 730);

            } catch (Exception e) {
            }

            documento.add(imagen);
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Registro de usuarios"));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("A continuación se mostrará un listado con el detalle de cada uno de los usuarios registrados."));

            PdfPTable Tabla_Usuarios = new PdfPTable(5);
            documento.add(Chunk.NEWLINE);

            Tabla_Usuarios.setWidthPercentage(100);
            PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
            nombre.setBackgroundColor(BaseColor.GRAY);

            PdfPCell apellidos = new PdfPCell(new Phrase("Apellidos"));
            apellidos.setBackgroundColor(BaseColor.GRAY);

            PdfPCell correo = new PdfPCell(new Phrase("Correo"));
            correo.setBackgroundColor(BaseColor.GRAY);

            PdfPCell usuario = new PdfPCell(new Phrase("Usuario"));
            usuario.setBackgroundColor(BaseColor.GRAY);

            PdfPCell perfil = new PdfPCell(new Phrase("Perfil"));
            perfil.setBackgroundColor(BaseColor.GRAY);

            Tabla_Usuarios.addCell(nombre);
            Tabla_Usuarios.addCell(apellidos);
            Tabla_Usuarios.addCell(correo);
            Tabla_Usuarios.addCell(usuario);
            Tabla_Usuarios.addCell(perfil);

            for (Usuarios t : ArrayUsuarios) {
                Tabla_Usuarios.addCell(t.getNombre());
                Tabla_Usuarios.addCell(t.getApellido());
                Tabla_Usuarios.addCell(t.getCorreo());
                Tabla_Usuarios.addCell(t.getUsuario());
                Tabla_Usuarios.addCell(t.getRol());
            }

            documento.add(Tabla_Usuarios);

            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Escanea el siguiente código QR"));
            BarcodeQRCode códigoqr = new BarcodeQRCode("Gracias por utilizar FastChat, el software más velóz y amigable para el usuario.", 1, 1, null);
            Image imagenqr = códigoqr.getImage();
            imagenqr.scalePercent(300);
            documento.add(imagenqr);

            Date Fecha = new Date();

            SimpleDateFormat FormatoFechaSimple = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

            documento.add(new Paragraph("Fecha: " + FormatoFechaSimple.format(Fecha)));

            documento.close();

            JOptionPane.showMessageDialog(null, "Su reporte ha sido creado");

        } catch (Exception e) {
        }

    }

}
