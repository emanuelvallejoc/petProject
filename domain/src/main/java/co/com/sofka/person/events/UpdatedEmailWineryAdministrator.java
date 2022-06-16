package co.com.sofka.person.events;

import co.com.sofka.person.values.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedEmailWineryAdministrator extends DomainEvent {

    private final Email email;

    public UpdatedEmailWineryAdministrator(Email email) {
        super(" co.com.sofka.ddd.person.events.UpdatedEmailWineryAdministrator");
        this.email = email;
    }


    public Email getEmail() {
        return email;
    }
}
