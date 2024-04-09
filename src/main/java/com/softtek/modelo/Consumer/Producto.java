package com.softtek.modelo.Consumer;

public class Producto {

        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getName() {
            return nombre;
        }

        public double getPrice() {
            return precio;
        }
    }
