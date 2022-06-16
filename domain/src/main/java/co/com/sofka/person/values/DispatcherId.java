package co.com.sofka.person.values;

import co.com.sofka.domain.generic.Identity;

public class DispatcherId  extends Identity {

    private DispatcherId(String id){
        super(id);
    }

    private  DispatcherId(){}

    public static DispatcherId of(String id){
        return  new DispatcherId(id);
    }
}
