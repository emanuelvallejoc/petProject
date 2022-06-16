package co.com.sofka.generics.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Nombre implements ValueObject<String> {

    private final String name;

    public Nombre(String name) {
        this.name = Objects.requireNonNull(name, "nombre es obligatorio");
    }

    @Override
    public String value() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nombre)) return false;
        Nombre nombre1 = (Nombre) o;
        return Objects.equals(name, nombre1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
