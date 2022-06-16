package co.com.sofka.persona.identities;

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
