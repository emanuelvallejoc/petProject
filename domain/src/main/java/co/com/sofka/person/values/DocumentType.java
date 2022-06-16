package co.com.sofka.person.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DocumentType implements ValueObject<DocumentType.Types> {

    private final Types types;

    @Override
    public Types value() {
        return types;
    }

    public DocumentType(Types types) {
        this.types = Objects.requireNonNull(types, "Tipo de documento es obligatorio");
    }

    public enum Types {
        CEDULA_CIUDADANIA,
        CEDULA_EXTRANJERIA,
        TARJETA_IDENTIDAD
    }
}
