package co.com.sofka.person.values;

import co.com.sofka.domain.generic.Identity;

public class WineryAdministratorId  extends Identity {

    public WineryAdministratorId(String id) {
        super(id);
    }

    public WineryAdministratorId() {
    }

    public static WineryAdministratorId of(String id){
        return new WineryAdministratorId(id);
    }
}
