package com.softtek.modelo.ejercicioPredicado;
import java.util.function.Predicate;
import java.util.function.IntPredicate;



public class ProbarPredicado {
    public static void main(String[] args) {


        Predicate<Integer> numPositivo = x -> x >= 0;
        boolean resultado = numPositivo.test(1);
        System.out.println(resultado);

        Predicate<String> noVacia = x -> x != "";
        boolean resultado1 = noVacia.test("Hola");
        System.out.println(resultado1);

        Predicate<Integer> numPar = x -> x % 2 == 0;
        boolean resultado2 = numPar.test(3);
        System.out.println(resultado2);

        Predicate<Integer> numMayor = x -> x > 10;
        boolean resultado3 = numMayor.test(5);
        System.out.println(resultado3);

    }
}



