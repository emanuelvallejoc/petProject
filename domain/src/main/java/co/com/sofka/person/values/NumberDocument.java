package co.com.sofka.person.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumberDocument implements ValueObject<String> {

    private final String number;

    public NumberDocument(String number) {
        if(number.isBlank() || number.isEmpty()){
            throw new IllegalArgumentException("El numero de documento no puede ser vacio");
        }
        this.number = Objects.requireNonNull(number, "Numero de documento es requerido");
    }

    public static NumberDocument of(String number){
        return new NumberDocument(number);
    }


    @Override
    public String value() {
        return number;
    }
}
