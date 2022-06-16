package co.com.sofka.person.event;

import co.com.sofka.generics.values.Nombre;
import co.com.sofka.person.values.TipoDocumento;
import co.com.sofka.person.values.Email;
import co.com.sofka.person.values.NumeroDocumento;
import co.com.sofka.person.values.AdministradorBodegaId;
import co.com.sofka.domain.generic.DomainEvent;

public class AdministradorBodegaCreado extends DomainEvent {
    private final AdministradorBodegaId administradorBodegaId;
    private final Nombre nombre;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;
    private final Email email;

    public AdministradorBodegaCreado(AdministradorBodegaId administradorBodegaId, Nombre nombre, TipoDocumento tipoDocumento,
                                     NumeroDocumento numeroDocumento, Email email){
        super("co.com.sofka.ddd.person.events.AdministradorBodegaCreado");
        this.administradorBodegaId = administradorBodegaId;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
    }

    public AdministradorBodegaId getAdministradorBodegaId() {
        return administradorBodegaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NumeroDocumento getNumeroDocumento() {
        return numeroDocumento;
    }

    public Email getEmail() {
        return email;
    }
}
