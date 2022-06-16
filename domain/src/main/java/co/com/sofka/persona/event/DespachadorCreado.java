package co.com.sofka.persona.event;

import co.com.sofka.generics.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.persona.values.DespachadorId;
import co.com.sofka.persona.values.TipoDocumento;
import co.com.sofka.persona.values.Email;
import co.com.sofka.persona.values.NumeroDocumento;

public class DespachadorCreado extends DomainEvent {

    private final DespachadorId entityId;
    private final Nombre nombre;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;
    private final Email email;

    public DespachadorCreado(DespachadorId entityId, Nombre nombre, TipoDocumento tipoDocumento,
                             NumeroDocumento numeroDocumento, Email email){
        super("co.com.sofka.ddd.person.events.DespachadorCreado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
    }

    public DespachadorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NumeroDocumento getNumeroDocumento() {
        return numeroDocumento;
    }

    public Email getEmail() {
        return email;
    }
}
