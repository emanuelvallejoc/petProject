package co.com.sofka.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;

public class Pedido extends Entity<PedidoId> {
    public Pedido(PedidoId entityId) {
        super(entityId);
    }
}
