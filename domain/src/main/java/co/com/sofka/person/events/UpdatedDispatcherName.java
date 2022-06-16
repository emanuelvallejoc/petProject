package co.com.sofka.person.events;

import co.com.sofka.generics.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedDispatcherName extends DomainEvent {

    private final Name name;

    public UpdatedDispatcherName(Name name) {
        super("co.com.sofka.ddd.person.events.UpdatedDispatcherName");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
