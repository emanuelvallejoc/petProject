package co.com.sofka.persona.usescases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.persona.Persona;
import co.com.sofka.persona.command.CrearDespachadorCommand;

public class CrearDespachadorUseCase extends UseCase<RequestCommand<CrearDespachadorCommand>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearDespachadorCommand> input) {

        var command = input.getCommand();
        var persona = new Persona(command.getPersonaId(), command.getEntityId(),
                command.getNombre(), command.getTipoDocumento(), command.getNumeroDocumento(), command.getEmail());

        emit().onResponse(new ResponseEvents(persona.getUncommittedChanges()));

    }
}
