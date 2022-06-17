package co.com.sofka.persona;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.persona.events.*;

public class PersonaChange extends EventChange {

    public PersonaChange(Persona persona) {
        apply((AdministradorBodegaCreado event)->{
            persona.administradorBodega = new AdministradorBodega(event.getAdministradorBodegaId(),
                    event.getNombre(),
                    event.getTipoDocumento(),
                    event.getNumeroDocumento(),
                    event.getEmail());
        });

        apply((DespachadorCreado event)->{
            persona.despachador = new Despachador(event.getEntityId(),
                    event.getNombre(),
                    event.getTipoDocumento(),
                    event.getNumeroDocumento(),
                    event.getEmail());
        });

        apply((NombreAdministradorBodegaActualizado event)->{
            persona.administradorBodega.actualizarNombre(event.getNombre());
        });

        apply((NombreDespachadorActualizado event)->{
            persona.despachador.actualizarNombre(event.getNombre());
        });

        apply((EmailDespachadorActualizado event)->{
            persona.despachador.actualizarEmail(event.getEmail());
        });

        apply((EmailAdministradorBodegaActualizado event)->{
            persona.administradorBodega.actualizarEmail(event.getEmail());
        });

    }
}
