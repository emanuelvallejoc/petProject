package co.com.sofka.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.producto.values.Precio;

public class ActualizaPrecioPedido extends DomainEvent {

    private final Precio precio;
    public ActualizaPrecioPedido(Precio precio) {
        super("co.com.sofka.ddd.person.events.ActualizaPrecioPedido");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}