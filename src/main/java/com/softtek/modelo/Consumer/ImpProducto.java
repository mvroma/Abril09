package com.softtek.modelo.Consumer;
import java.util.function.Consumer;

public class ImpProducto implements Consumer<Producto> {
    @Override
    public void accept(Producto producto) {
        System.out.println("Nombre: " + producto.getName());
        System.out.println("Precio: " + producto.getPrice());
    }
}
