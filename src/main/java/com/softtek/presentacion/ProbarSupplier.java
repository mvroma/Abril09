package com.softtek.presentacion;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Supplier;

public class ProbarSupplier {
    public static void main(String[] args) {
        //Número aleatorio
        Supplier<Integer> numAleatorio = () -> new Random().nextInt(30);
        System.out.println("El número aleatorio es: " + numAleatorio.get());

        //Lista de elementos
        Supplier<List<String>> listaElementos = () -> {
            List<String> lista = new ArrayList<>();
            lista.add("uno");
            lista.add("dos");
            lista.add("tres");
            return lista;
        };
        List<String> numeros = listaElementos.get();
        System.out.println("La lista de números es la siguiente: " + numeros);

        //Proveedor de fecha y hora actual:
        Supplier<LocalDateTime> fx = () -> LocalDateTime.now();
        System.out.println(fx.get());

        //Proveedor de un nuevo objeto String vacío:
        Supplier<String> proovedorCadena = () -> "";
        String cadenaVacia = proovedorCadena.get();
        System.out.println("La cadena está vacía: " + cadenaVacia);

        //Proveedor de un objeto de configuración de la aplicación:


            Supplier<Map<String, String>> proovedorConfiguracion = () -> {
                Map<String, String> configuracion = new HashMap<>();
                configuracion.put("ruta_archivos", "/ruta/del/archivo");
                configuracion.put("ajustes_conexion", "localhost:8080");
                return configuracion;
            };
            Map<String, String> configuracion = proovedorConfiguracion.get();

            System.out.println("Configuracion de la aplicacion");
            configuracion.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
        }
    }


