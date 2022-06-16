package co.com.sofka.producto;

import co.com.sofka.domain.generic.AggregateEvent;

public class Producto extends AggregateEvent<ProductoId> {

    protected Disponible disponible;

    protected Pedido pedido;

    public Producto(ProductoId entityId) {
        super(entityId);
    }
}
