package co.com.sofka.person;

import co.com.sofka.generics.values.Nombre;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.person.identities.DespachadorId;
import co.com.sofka.person.values.TipoDocumento;
import co.com.sofka.person.values.Email;
import co.com.sofka.person.values.NumeroDocumento;

import java.util.Objects;

public class Despachador extends Entity<DespachadorId> {

    protected Nombre nombre;
    protected TipoDocumento tipoDocumento;
    protected NumeroDocumento numeroDocumento;
    protected Email email;

    public Despachador(DespachadorId despachadorId, Nombre nombre, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento, Email email) {
        super(despachadorId);
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
    }

    private Despachador(DespachadorId entityId) {
        super(entityId);
    }

    public static Despachador from(DespachadorId entityId, Nombre nombre, TipoDocumento tipoDocumento,
                                   NumeroDocumento numeroDocumento, Email email){

        var despachador = new Despachador(entityId);

        despachador.nombre = nombre;
        despachador.tipoDocumento = tipoDocumento;
        despachador.numeroDocumento = numeroDocumento;
        despachador.email=email;

        return despachador;

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


    public void actualizarEmail(Email email){
        this.email =email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Despachador)) return false;
        if (!super.equals(o)) return false;
        Despachador that = (Despachador) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(tipoDocumento, that.tipoDocumento) && Objects.equals(numeroDocumento, that.numeroDocumento) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombre, tipoDocumento, numeroDocumento, email);
    }
}
