package co.com.sofka.producto.identities;

import co.com.sofka.domain.generic.Identity;

public class DisponibleId extends Identity {

    private DisponibleId(String id){ super(id); }

    public DisponibleId(){}

    public static DisponibleId of(String id) { return new DisponibleId(id); }
}
