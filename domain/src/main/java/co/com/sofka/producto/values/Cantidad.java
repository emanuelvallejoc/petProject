package co.com.sofka.producto.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

import static java.util.Objects.isNull;

public class Cantidad implements ValueObject<Integer> {
    private final Integer number;
    public Cantidad(Integer number) {
        if(isNull(number) && number<0){
            throw new IllegalArgumentException("La Cantidad no puede ser negativa, ni vacia");
        }
        this.number = Objects.requireNonNull(number, "Numero de documento es requerido");
    }

    public static Cantidad of(Integer number){ return new Cantidad(number);  }

    @Override
    public Integer value() {
        return number;
    }
}
