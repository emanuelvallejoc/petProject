package co.com.sofka.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.producto.values.Cantidad;

public class ActualizaCantidadDisponible extends DomainEvent {

    private final Cantidad cantidad;

    public ActualizaCantidadDisponible(Cantidad cantidad) {
        super("co.com.sofka.ddd.person.events.ActualizaCantidadDisponible");
        this.cantidad = cantidad;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}