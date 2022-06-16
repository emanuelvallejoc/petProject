package co.com.sofka.person;

import co.com.sofka.generics.values.Nombre;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.person.values.TipoDocumento;
import co.com.sofka.person.values.Email;
import co.com.sofka.person.values.NumeroDocumento;
import co.com.sofka.person.values.AdministradorBodegaId;

import java.util.Objects;

public class AdministradorBodega extends Entity<AdministradorBodegaId> {

    protected Nombre nombre;
    protected TipoDocumento tipoDocumento;
    protected NumeroDocumento numeroDocumento;
    protected Email email;

    public AdministradorBodega(AdministradorBodegaId entityId, Nombre nombre, TipoDocumento tipoDocumento,
                               NumeroDocumento numeroDocumento, Email email) {
        super(entityId);
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
    }

    public AdministradorBodega(AdministradorBodegaId entityId) {
        super(entityId);

    }

    public static AdministradorBodega from(AdministradorBodegaId entityId, Nombre nombre, TipoDocumento tipoDocumento,
                                           NumeroDocumento numeroDocumento, Email email){

        var wineryAdministrator = new AdministradorBodega(entityId);

        wineryAdministrator.nombre = nombre;
        wineryAdministrator.tipoDocumento = tipoDocumento;
        wineryAdministrator.numeroDocumento = numeroDocumento;
        wineryAdministrator.email=email;

        return wineryAdministrator;

    }

    public String nombre() {
        return nombre.value();
    }

    public TipoDocumento.Types tipoDocumento() {
        return tipoDocumento.value();
    }

    public String numeroDocumento() {
        return numeroDocumento.value();
    }

    public String email() {
        return email.value();
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void actualizarTipoDocumento(TipoDocumento tipoDocumento){
        this.tipoDocumento = tipoDocumento;
    }

    public  void actualizarEmail(Email email){
        this.email =email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdministradorBodega)) return false;
        if (!super.equals(o)) return false;
        AdministradorBodega that = (AdministradorBodega) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(tipoDocumento, that.tipoDocumento) && Objects.equals(numeroDocumento, that.numeroDocumento) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, tipoDocumento, numeroDocumento, email);
    }
}
