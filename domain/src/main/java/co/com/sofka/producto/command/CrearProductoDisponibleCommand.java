package co.com.sofka.producto.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.producto.identities.DisponibleId;
import co.com.sofka.producto.identities.ProductoId;
import co.com.sofka.producto.values.Cantidad;
import co.com.sofka.producto.values.Precio;

public class CrearProductoDisponibleCommand extends Command {

    private final ProductoId productoId;

    private final DisponibleId disponibleId;

    private final Nombre nombre;

    private final Precio precio;

    private final Cantidad cantidad;

    public CrearProductoDisponibleCommand(ProductoId productoId, DisponibleId disponibleId, Nombre nombre, Precio precio, Cantidad cantidad){
        this.productoId = productoId;
        this.disponibleId = disponibleId;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public DisponibleId getDisponibleId() {
        return disponibleId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Cantidad getCantidad() { return cantidad; }

}
