package co.com.sofka.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.producto.events.*;
import co.com.sofka.producto.identities.DisponibleId;
import co.com.sofka.producto.identities.PedidoId;
import co.com.sofka.producto.identities.ProductoId;
import co.com.sofka.producto.values.Cantidad;
import co.com.sofka.producto.values.Precio;

public class Producto extends AggregateEvent<ProductoId> {

    protected Disponible disponible;

    protected Pedido pedido;

    public Producto(ProductoId productoId, DisponibleId disponibleId, Nombre nombre, Precio precio, Cantidad cantidad) {
        super(productoId);
        subscribe(new ProductoChange(this));
        appendChange( new DisponibleCreado(disponibleId, nombre, precio, cantidad)).apply();
    }

    public Producto(ProductoId productoId, PedidoId pedidoId, Nombre nombre, Precio precio, Cantidad cantidad) {
        super(productoId);
        subscribe(new ProductoChange(this));
        appendChange( new PedidoCreado(pedidoId, nombre, precio, cantidad)).apply();
    }

    public void actualizarNombreDisponible(Nombre nombre){
        appendChange(new ActualizarNombreDisponible(nombre)).apply();
    }

    public void actualizarNombrePedido(Nombre nombre){
        appendChange(new ActualizarNombrePedido(nombre)).apply();
    }

    public void actualizaPrecioDisponible(Precio precio){
        appendChange(new ActualizaPrecioDisponible(precio)).apply();
    }

    public void actualizaPrecioPedido(Precio precio){
        appendChange(new ActualizaPrecioPedido(precio)).apply();
    }

    public void actualizaCantidadDisponible(Cantidad cantidad){
        appendChange(new ActualizaCantidadDisponible(cantidad)).apply();
    }

    public void actualizaCantidadPedido(Cantidad cantidad){
        appendChange(new ActualizaCantidadPedido(cantidad)).apply();
    }
}
