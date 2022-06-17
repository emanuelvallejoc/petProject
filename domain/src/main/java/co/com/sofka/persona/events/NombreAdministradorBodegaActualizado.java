package co.com.sofka.persona.events;

import co.com.sofka.generics.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreAdministradorBodegaActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreAdministradorBodegaActualizado(Nombre nombre) {
        super(" co.com.sofka.ddd.person.events.NombreAdministradorBodegaActualizado");
        this.nombre = nombre;
    }


    public Nombre getNombre() {
        return nombre;
    }
}
