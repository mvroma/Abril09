package com.softtek.modelo.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class Globo {

    private final int ID;

    public static int CONTADOR = 0;

    public Globo() {
        this.ID = ++CONTADOR;
    }
}
