package co.com.sofka.persona;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.persona.identities.AdministradorBodegaId;
import co.com.sofka.persona.events.*;
import co.com.sofka.persona.identities.DespachadorId;
import co.com.sofka.persona.identities.PersonaId;
import co.com.sofka.persona.values.*;

import java.util.List;


public class Persona extends AggregateEvent<PersonaId> {
    protected Despachador despachador;

    protected AdministradorBodega administradorBodega;

    public Persona(PersonaId entityId) {
        super(entityId);
        subscribe(new PersonaChange(this));
    }

    public Persona(PersonaId personaId , DespachadorId dispatcherId, Nombre nombre, TipoDocumento tipoDocumento,
                   NumeroDocumento numeroDocumento, Email email) {
        super(personaId);
        subscribe(new PersonaChange(this));
        appendChange( new DespachadorCreado(dispatcherId, nombre, tipoDocumento, numeroDocumento, email)).apply();
    }

    public Persona(PersonaId personaId, AdministradorBodegaId administradorBodegaId, Nombre nombre, TipoDocumento tipoDocumento,
                   NumeroDocumento numeroDocumento, Email email) {

        super(personaId);
        subscribe(new PersonaChange(this));
        appendChange( new AdministradorBodegaCreado(administradorBodegaId, nombre, tipoDocumento,
                numeroDocumento,email)).apply();

    }

    public static Persona from(PersonaId personaId, List<DomainEvent> events){
        var persona = new Persona(personaId);
        events.forEach(persona::applyEvent);
        return persona;
    }

    public void actualizarNombreDespachador(Nombre nombre){
        appendChange(new NombreDespachadorActualizado(nombre)).apply();
    }

    public void actualizarNombreAdministradorBodega(Nombre nombre){
        appendChange(new NombreAdministradorBodegaActualizado(nombre)).apply();
    }

    public void actualizarEmailDespachador(Email email){
        appendChange(new EmailDespachadorActualizado(email)).apply();
    }

    public void actualizarEmailAdministradorBodega(Email email){
        appendChange(new EmailAdministradorBodegaActualizado(email)).apply();
    }




}
