package co.com.sofka.producto.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;


public class Cantidad implements ValueObject<Integer> {
    private final Integer cantidad;

    public Cantidad(Integer cantidad) {
        this.cantidad = Objects.requireNonNull(cantidad, "CANTIDAD PRODUCTOS");

    }

    @Override
    public Integer value() { return cantidad; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cantidad)) return false;
        Cantidad that = (Cantidad) o;
        return Objects.equals(cantidad, that.cantidad);
    }

    @Override
    public int hashCode() { return Objects.hash(cantidad); }
}
