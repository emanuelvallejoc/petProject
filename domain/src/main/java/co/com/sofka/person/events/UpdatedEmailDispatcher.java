package co.com.sofka.person.events;

import co.com.sofka.person.values.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedEmailDispatcher extends DomainEvent {

    private final Email email;

    public UpdatedEmailDispatcher(Email email) {
        super("co.com.sofka.ddd.person.events.UpdatedEmailDispatcher");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
