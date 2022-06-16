package co.com.sofka.person;

import co.com.sofka.generics.values.Name;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.person.values.DocumentType;
import co.com.sofka.person.values.Email;
import co.com.sofka.person.values.NumberDocument;
import co.com.sofka.person.values.WineryAdministratorId;

import java.util.Objects;

public class WineryAdministrator extends Entity<WineryAdministratorId> {

    protected Name name;
    protected DocumentType documentType;
    protected NumberDocument numberDocument;
    protected Email email;

    public WineryAdministrator(WineryAdministratorId entityId, Name name, DocumentType documentType,
                                NumberDocument numberDocument, Email email) {
        super(entityId);
        this.name = name;
        this.documentType = documentType;
        this.numberDocument = numberDocument;
        this.email = email;
    }

    public WineryAdministrator(WineryAdministratorId entityId) {
        super(entityId);

    }

    public static WineryAdministrator from(WineryAdministratorId entityId, Name name, DocumentType documentType,
                                            NumberDocument numberDocument, Email email){

        var wineryAdministrator = new WineryAdministrator(entityId);

        wineryAdministrator.name = name;
        wineryAdministrator.documentType = documentType;
        wineryAdministrator.numberDocument = numberDocument;
        wineryAdministrator.email=email;

        return wineryAdministrator;

    }

    public String name() {
        return name.value();
    }

    public DocumentType.Types documentType() {
        return documentType.value();
    }

    public String numberDocument() {
        return numberDocument.value();
    }

    public String email() {
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
        if (!(o instanceof WineryAdministrator)) return false;
        if (!super.equals(o)) return false;
        WineryAdministrator that = (WineryAdministrator) o;
        return Objects.equals(name, that.name) && Objects.equals(documentType, that.documentType) && Objects.equals(numberDocument, that.numberDocument) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, documentType, numberDocument, email);
    }
}
