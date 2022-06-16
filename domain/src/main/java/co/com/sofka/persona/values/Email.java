package co.com.sofka.persona.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email  implements ValueObject<String> {

    private final String email;

    public Email(String email){
        this.email = Objects.requireNonNull(email, "Email requerido");
    }

    public static  Email of(String email){
        return new Email(email);
    }

    @Override
    public String value() {
        return email;
    }
}
