package co.com.sofka.person.events;

import co.com.sofka.generics.values.Name;
import co.com.sofka.person.values.DocumentType;
import co.com.sofka.person.values.Email;
import co.com.sofka.person.values.NumberDocument;
import co.com.sofka.person.values.WineryAdministratorId;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedWineryAdministrator extends DomainEvent {
    private final WineryAdministratorId wineryAdministratorId;
    private final Name name;
    private final DocumentType documentType;
    private final NumberDocument numberDocument;
    private final Email email;

    public CreatedWineryAdministrator(WineryAdministratorId wineryAdministratorId,Name name, DocumentType documentType,
                                      NumberDocument numberDocument, Email email){
        super("co.com.sofka.ddd.person.events.CreatedWineryAdministrator");
        this.wineryAdministratorId = wineryAdministratorId;
        this.name = name;
        this.documentType = documentType;
        this.numberDocument = numberDocument;
        this.email = email;
    }

    public WineryAdministratorId getWineryAdministratorId() {
        return wineryAdministratorId;
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
