package com.softtek.presentacion;

import com.softtek.modelo.ejercicio2.Calculadora;

public class pruebaEjercicio2 {
    public static void main(String[] args) {


        System.out.println(Calculadora.sumar(2, 2));
        System.out.println(Calculadora.restar(10, 2));
        System.out.println(Calculadora.multiplicar(2, 2));
        try {
            System.out.println(Calculadora.dividir(2, 0));
        } catch (ArithmeticException error) {
            System.out.println(error);
        } finally {
            System.out.println(Calculadora.dividir(6, 3));
        }
    }
}
