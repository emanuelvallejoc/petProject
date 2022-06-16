package co.com.sofka.persona.usescases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.persona.Persona;
import co.com.sofka.persona.command.CrearAdministradorDeBodegaCommand;

public class CrearAdminBodegaUseCase extends UseCase<RequestCommand<CrearAdministradorDeBodegaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearAdministradorDeBodegaCommand> input) {

        var command = input.getCommand();

        var adminBodega = new Persona(command.getPersonaId(), command.getEntityId(), command.getNombre(),
                command.getTipoDocumento(), command.getNumeroDocumento(), command.getEmail());

        emit().onResponse(new ResponseEvents(adminBodega.getUncommittedChanges()));

    }
}
