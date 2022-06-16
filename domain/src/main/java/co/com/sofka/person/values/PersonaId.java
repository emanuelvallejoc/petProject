package co.com.sofka.person.values;

import co.com.sofka.domain.generic.Identity;

public class PersonaId extends Identity {

    private PersonaId(String id) {
        super(id);
    }

    private PersonaId() {
        super();
    }

    public static PersonaId of(String id){
        return  new PersonaId(id);
    }
}
