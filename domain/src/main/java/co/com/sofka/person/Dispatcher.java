package co.com.sofka.person;

import co.com.sofka.generics.values.Name;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.person.values.DispatcherId;
import co.com.sofka.person.values.DocumentType;
import co.com.sofka.person.values.Email;
import co.com.sofka.person.values.NumberDocument;

import java.util.Objects;

public class Dispatcher extends Entity<DispatcherId> {

    protected Name name;
    protected DocumentType documentType;
    protected NumberDocument numberDocument;
    protected Email email;

    public Dispatcher(DispatcherId dispatcherId,  Name name, DocumentType documentType, NumberDocument numberDocument, Email email) {
        super(dispatcherId);
        this.name = name;
        this.documentType = documentType;
        this.numberDocument = numberDocument;
        this.email = email;
    }

    private Dispatcher(DispatcherId entityId) {
        super(entityId);
    }

    public static Dispatcher from(DispatcherId entityId, Name name, DocumentType documentType,
                                            NumberDocument numberDocument, Email email){

        var dispatcher = new Dispatcher(entityId);

        dispatcher.name = name;
        dispatcher.documentType = documentType;
        dispatcher.numberDocument = numberDocument;
        dispatcher.email=email;

        return dispatcher;

    }

    public String name() {
        return name.value();
    }

    public DocumentType.Types getDocumentType() {
        return documentType.value();
    }

    public String getNumberDocument() {
        return numberDocument.value();
    }

    public String getEmail() {
        return email.value();
    }

    public void updateName(Name name){
        this.name = name;
    }

    public void updateDocumentType(DocumentType documentType){
        this.documentType = documentType;
    }

    public  void updateEmail(Email email){
        this.email =email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dispatcher)) return false;
        if (!super.equals(o)) return false;
        Dispatcher that = (Dispatcher) o;
        return Objects.equals(name, that.name) && Objects.equals(documentType, that.documentType) && Objects.equals(numberDocument, that.numberDocument) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, documentType, numberDocument, email);
    }
}
