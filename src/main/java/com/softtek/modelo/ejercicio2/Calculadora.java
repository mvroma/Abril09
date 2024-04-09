package com.softtek.modelo.ejercicio2;


//Crear una clase Calculadora con métodos estáticos: suma, resta, multiplica y divide.
//Desde una clase principal PruebasCalculadora invocar a los cuatro métodos.

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Calculadora {
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) throws ArithmeticException {
        double resultado = 0;
        if (num2 == 0) {
            throw new ArithmeticException("No se divide entre 0");
        } else {
            resultado = num1 / num2;
        }
        return resultado;
    }

}
