package com.softtek.presentacion;

import com.softtek.modelo.ejercicio1.Globo;

public class pruebaEjercicio1 {
    public static void main(String[] args) {
        System.out.println(Globo.CONTADOR);
        Globo globo1 = new Globo();
        System.out.println(globo1.toString());

        Globo globo2 = new Globo();
        System.out.println(globo2.toString());



    }
}
