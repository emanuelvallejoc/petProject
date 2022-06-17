package co.com.sofka.producto.identities;

import co.com.sofka.domain.generic.Identity;

public class PedidoId extends Identity {

    private PedidoId(String id){ super(id); }

    public PedidoId(){}

    public static PedidoId of(String id) { return new PedidoId(id); }

}
