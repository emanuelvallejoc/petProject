package co.com.sofka.person;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.person.events.*;

public class PersonChange extends EventChange {

    public PersonChange(Person person) {
        apply((CreatedWineryAdministrator event)->{
            person.wineryAdministrator = new WineryAdministrator(event.getWineryAdministratorId(),
                    event.getName(),
                    event.getDocumentType(),
                    event.getNumberDocument(),
                    event.getEmail());
        });

        apply((CreatedDispatcher event)->{
            person.dispatcher = new Dispatcher(event.getEntityId(),
                    event.getName(),
                    event.getDocumentType(),
                    event.getNumberDocument(),
                    event.getEmail());
        });

        apply((UpdatedNameWineryAdministrator event)->{
            person.wineryAdministrator.updateName(event.getName());
        });

        apply((UpdatedDispatcherName event)->{
            person.dispatcher.updateName(event.getName());
        });

        apply((UpdatedEmailDispatcher event)->{
            person.dispatcher.updateEmail(event.getEmail());
        });

        apply((UpdatedEmailWineryAdministrator event)->{
            person.wineryAdministrator.updateEmail(event.getEmail());
        });

    }
}
