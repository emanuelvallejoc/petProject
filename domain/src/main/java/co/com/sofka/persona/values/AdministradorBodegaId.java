package co.com.sofka.persona.values;

import co.com.sofka.domain.generic.Identity;

public class AdministradorBodegaId extends Identity {

    public AdministradorBodegaId(String id) {
        super(id);
    }

    public AdministradorBodegaId() {
    }

    public static AdministradorBodegaId of(String id){
        return new AdministradorBodegaId(id);
    }
}
