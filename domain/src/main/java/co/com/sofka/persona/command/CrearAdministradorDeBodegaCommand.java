package co.com.sofka.persona.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.persona.values.*;

public class CrearAdministradorDeBodegaCommand extends Command {

    private final PersonaId personaId;
    private final AdministradorBodegaId entityId;
    private final Nombre nombre;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;
    private final Email email;

    public CrearAdministradorDeBodegaCommand(PersonaId personaId, AdministradorBodegaId entityId, Nombre nombre,
                                      TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento, Email email) {
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

    public AdministradorBodegaId getEntityId() {
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
