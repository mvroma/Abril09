package com.softtek.presentacion;

import com.softtek.modelo.ejercicio3.Persona;
import com.softtek.modelo.ejercicio3.estadoCivil;

public class pruebaEjercicio3 {
    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", 23);

        estadoCivil estadocivil = estadoCivil.CASADO;

        switch(estadocivil) {
            case CASADO:
                System.out.println("Está casado");
                break;
            case DIVORCIADO:
                System.out.println("MEstá divorciado");
                break;
            case VIUDO:
                System.out.println("Es viudo");
                break;
        }
    }
}
