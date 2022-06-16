package co.com.sofka.producto.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;


public class Precio implements ValueObject<Integer> {

    private final Integer precio;

    public Precio(Integer precio) {
        this.precio = Objects.requireNonNull(precio, "Precio es obligatorio");
    }

    public Integer value() { return precio; }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Precio)) return false;
        Precio precio1 = (Precio) o;
        return Objects.equals(precio, precio1.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }
  */
}
