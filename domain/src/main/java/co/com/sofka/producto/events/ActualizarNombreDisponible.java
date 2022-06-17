package co.com.sofka.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;

public class ActualizarNombreDisponible extends DomainEvent {

    private final Nombre nombre;

    public ActualizarNombreDisponible(Nombre nombre) {
        super("co.com.sofka.ddd.person.events.NombreDespachadorActualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
