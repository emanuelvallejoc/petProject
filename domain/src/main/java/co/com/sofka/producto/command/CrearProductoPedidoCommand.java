package co.com.sofka.producto.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;

import co.com.sofka.producto.identities.PedidoId;
import co.com.sofka.producto.identities.ProductoId;
import co.com.sofka.producto.values.Cantidad;
import co.com.sofka.producto.values.Precio;

public class CrearProductoPedidoCommand extends Command {

    private final ProductoId productoId;

    private final PedidoId pedidoId;

    private final Nombre nombre;

    private final Precio precio;

    private final Cantidad cantidad;

    public CrearProductoPedidoCommand(ProductoId productoId, PedidoId disponibleId, PedidoId pedidoId, Nombre nombre, Precio precio, Cantidad cantidad){
        this.productoId = productoId;
        this.pedidoId = pedidoId;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Cantidad getCantidad() { return cantidad; }

}
