package co.com.sofka.person;

import co.com.sofka.generics.values.Name;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.person.events.*;
import co.com.sofka.person.values.*;

public class Person extends AggregateEvent<PersonaId> {
    protected Dispatcher dispatcher;

    protected WineryAdministrator wineryAdministrator;

    public Person(PersonaId personaId , DispatcherId dispatcherId, Name name, DocumentType documentType ,
                  NumberDocument numberDocument, Email email) {
        super(personaId);
        subscribe(new PersonChange(this));
        appendChange( new CreatedDispatcher(dispatcherId, name, documentType, numberDocument, email)).apply();
    }

    public Person(PersonaId personaId, WineryAdministratorId wineryAdministratorId, Name name,  DocumentType documentType ,
                  NumberDocument numberDocument, Email email) {

        super(personaId);
        subscribe(new PersonChange(this));
        appendChange( new CreatedWineryAdministrator(wineryAdministratorId,name, documentType,
                numberDocument,email)).apply();

    }

    public void updateNameDispatcher(Name name){
        appendChange(new UpdatedDispatcherName(name)).apply();
    }

    public void updateNameWineryAdministrator(Name name){
        appendChange(new UpdatedNameWineryAdministrator(name)).apply();
    }

    public void updateEmailDispatcher(Email email){
        appendChange(new UpdatedEmailDispatcher(email)).apply();
    }

    public void updateEmailWineryAdministrator(Email email){
        appendChange(new UpdatedEmailWineryAdministrator(email)).apply();
    }




}
