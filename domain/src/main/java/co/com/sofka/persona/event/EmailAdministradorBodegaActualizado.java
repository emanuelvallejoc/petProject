package co.com.sofka.persona.event;

import co.com.sofka.persona.values.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailAdministradorBodegaActualizado extends DomainEvent {

    private final Email email;

    public EmailAdministradorBodegaActualizado(Email email) {
        super(" co.com.sofka.ddd.person.events.EmailAdministradorBodegaActualizado");
        this.email = email;
    }


    public Email getEmail() {
        return email;
    }
}
