package co.com.sofka.person.events;

import co.com.sofka.generics.values.Name;
import co.com.sofka.ddd.person.values.*;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.person.values.DispatcherId;
import co.com.sofka.person.values.DocumentType;
import co.com.sofka.person.values.Email;
import co.com.sofka.person.values.NumberDocument;

public class CreatedDispatcher extends DomainEvent {

    private final DispatcherId entityId;
    private final Name name;
    private final DocumentType documentType;
    private final NumberDocument numberDocument;
    private final Email email;

    public CreatedDispatcher(DispatcherId entityId,Name name, DocumentType documentType,
                             NumberDocument numberDocument, Email email){
        super("co.com.sofka.ddd.person.events.CreatedDispatcher");
        this.entityId = entityId;
        this.name = name;
        this.documentType = documentType;
        this.numberDocument = numberDocument;
        this.email = email;
    }

    public DispatcherId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public NumberDocument getNumberDocument() {
        return numberDocument;
    }

    public Email getEmail() {
        return email;
    }
}
