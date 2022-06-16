package co.com.sofka.person.events;

import co.com.sofka.generics.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedNameWineryAdministrator extends DomainEvent {

    private final Name name;

    public UpdatedNameWineryAdministrator(Name name) {
        super(" co.com.sofka.ddd.person.events.UpdatedNameWineryAdministrator");
        this.name = name;
    }


    public Name getName() {
        return name;
    }
}
