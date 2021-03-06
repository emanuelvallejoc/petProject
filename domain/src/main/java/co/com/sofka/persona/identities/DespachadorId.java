package co.com.sofka.persona.identities;
import co.com.sofka.domain.generic.Identity;

public class DespachadorId extends Identity {

    private DespachadorId(String id){
        super(id);
    }

    private DespachadorId(){}

    public static DespachadorId of(String id){
        return  new DespachadorId(id);
    }
}
