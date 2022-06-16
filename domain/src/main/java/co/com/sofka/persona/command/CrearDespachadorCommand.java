package co.com.sofka.persona.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.persona.values.*;

public class CrearDespachadorCommand extends Command {

    private final PersonaId personaId;
    private final DespachadorId entityId;
    private final Nombre nombre;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;
    private final Email email;

    public CrearDespachadorCommand(PersonaId personaId, DespachadorId entityId, Nombre nombre, TipoDocumento tipoDocumento, NumeroDocumento
            numeroDocumento, Email email) {
        this.personaId = personaId;
        this.entityId = entityId;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
    }

    public PersonaId getPersonaId() {
        return personaId;
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
