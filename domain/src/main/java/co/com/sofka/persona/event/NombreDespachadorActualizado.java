package co.com.sofka.persona.event;

import co.com.sofka.generics.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDespachadorActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreDespachadorActualizado(Nombre nombre) {
        super("co.com.sofka.ddd.person.events.NombreDespachadorActualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
