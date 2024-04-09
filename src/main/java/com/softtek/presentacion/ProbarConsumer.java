package com.softtek.presentacion;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.function.Supplier;

import com.softtek.modelo.Consumer.Producto;
import com.softtek.modelo.Consumer.ImpProducto;

public class ProbarConsumer {
    public static void main(String[] args) {
        Consumer<String> impMayus = s -> System.out.println(s.toUpperCase());
        impMayus.accept("Hello World");

        Consumer<Integer> numCua = x -> {
            int cuadrado = x * x;
            System.out.println("El número es: " + x + " y su cuadrado es: " + cuadrado);
        };
        numCua.accept(5);

        Producto producto = new Producto("Pc", 1000.0);
        ImpProducto impProducto = new ImpProducto();
        impProducto.accept(producto);


            }
        }
     class cuaDialog {
         public static void main(String[] args) {
             String mensaje = "Buenos días, bienvenido a Softtek";
             showDialogBox(mensaje);
         }

         public static void showDialogBox(String mensaje) {
             Consumer<String> showMessage = (msg) -> JOptionPane.showMessageDialog(null, msg);
             showMessage.accept(mensaje);
         }
     }

class ArchivoRegistro {
    private static final String LOG_FILE_NAME = "event_log.txt";

    public static void main(String[] args) {
        String mensaje = "Buenos días";
        writeEventToLog(mensaje, message -> {
            File logFile = new File(LOG_FILE_NAME);

            try (FileWriter fileWriter = new FileWriter(logFile, true)) {
                fileWriter.write(message + System.lineSeparator());
                fileWriter.flush();
                System.out.println("Evento registrado: " + message);
            } catch (IOException e) {
                System.err.println("Error al escribir el archivo de registro: " + e.getMessage());
            }
        });
    }

    public static void writeEventToLog(String eventMessage, Consumer<String> writeFunction) {
        writeFunction.accept(eventMessage);
    }

}



