package co.com.sofka.producto;

import co.com.sofka.domain.generic.Identity;

public class DisponibleId extends Identity {

    public DisponibleId(){}

    private DisponibleId(String id){ super(id); }

    public static DisponibleId of(String id) { return new DisponibleId(id); }
}
