package co.com.sofka.producto.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.producto.values.Cantidad;
import co.com.sofka.producto.values.Precio;

public class CrearProductoCommand extends Command {

    private final Nombre nombre;

    private final Precio precio;

    private final Cantidad cantidad;

    public CrearProductoCommand(Nombre nombre, Precio precio, Cantidad cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Cantidad getCantidad() { return cantidad; }

}
