package co.com.sofka.persona.events;

import co.com.sofka.persona.values.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailDespachadorActualizado extends DomainEvent {

    private final Email email;

    public EmailDespachadorActualizado(Email email) {
        super("co.com.sofka.ddd.person.events.EmailDespachadorActualizado");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
