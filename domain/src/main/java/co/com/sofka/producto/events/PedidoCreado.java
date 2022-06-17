package co.com.sofka.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.producto.identities.PedidoId;
import co.com.sofka.producto.values.Cantidad;
import co.com.sofka.producto.values.Precio;

public class PedidoCreado extends DomainEvent {

    private final PedidoId pedidoId;

    private  final Nombre nombre;

    private final Precio precio;

    private final Cantidad cantidad;

    public PedidoCreado(PedidoId pedidoId, Nombre nombre, Precio precio, Cantidad cantidad) {
        super("co.com.sofka.ddd.producto.events.PedidoCreado");
        this.pedidoId = pedidoId;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public PedidoId getPedidoId() { return pedidoId; }

    public Nombre getNombre() { return nombre; }

    public Precio getPrecio() { return precio; }

    public Cantidad getCantidad() { return cantidad; }

}
