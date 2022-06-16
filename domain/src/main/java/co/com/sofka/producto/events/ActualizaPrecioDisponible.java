package co.com.sofka.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.producto.values.Precio;

public class ActualizaPrecioDisponible extends DomainEvent {

    private final Precio precio;
    public ActualizaPrecioDisponible(Precio precio) {
        super("co.com.sofka.ddd.person.events.ActualizaPrecioDisponible");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
