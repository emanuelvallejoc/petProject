package co.com.sofka.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Name;

public class Disponible extends Entity<DisponibleId> {

    protected Precio precio;

    protected Cantidad cantidad;

    protected Name nombre;


    public Disponible(DisponibleId entityId) {
        super(entityId);
    }
}
