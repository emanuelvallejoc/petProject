package co.com.sofka.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.producto.identities.DisponibleId;
import co.com.sofka.producto.values.Cantidad;
import co.com.sofka.producto.values.Precio;

public class DisponibleCreado extends DomainEvent {

    private final DisponibleId disponibleId;

    private  final Nombre nombre;

    private final Precio precio;

    private final Cantidad cantidad;

    public DisponibleCreado(DisponibleId disponibleId, Nombre nombre, Precio precio, Cantidad cantidad) {
        super("co.com.sofka.ddd.producto.events.DisponibleCreado");
        this.disponibleId = disponibleId;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public DisponibleId getDisponibleId() { return disponibleId; }

    public Nombre getNombre() { return nombre; }

    public Precio getPrecio() { return precio; }

    public Cantidad getCantidad() { return cantidad; }

}
