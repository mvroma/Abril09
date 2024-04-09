package com.softtek.modelo.ejercicioPredicado;

import java.util.function.Predicate;

public class NumPrimo {
    public static void main(String[] args) {
        Predicate<Integer> esPrimo = x -> {
            if (x <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(x); i++){
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };
        boolean resultadoPrimo = esPrimo.test(8);
        System.out.println("¿El número es primo? " + resultadoPrimo);
    }
}

