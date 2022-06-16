package co.com.sofka.producto;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.producto.events.*;

public class ProductoChange extends EventChange {
    public ProductoChange(Producto producto) {
        apply((DisponibleCreado event)->{
            producto.disponible = new Disponible(event.getDisponibleId(),
                    event.getNombre(),
                    event.getPrecio(),
                    event.getCantidad());
        });

        apply((PedidoCreado event)->{
            producto.pedido = new Pedido(event.getPedidoId(),
                    event.getNombre(),
                    event.getPrecio(),
                    event.getCantidad());
        });

        apply((ActualizarNombrePedido event)->{
            producto.disponible.actualizarNombre(event.getNombre());
        });

        apply((ActualizarNombreDisponible event)->{
            producto.pedido.actualizarNombre(event.getNombre());
        });

        apply((ActualizaPrecioPedido event)->{
            producto.pedido.actializarPrecio(event.getPrecio());
        });

        apply((ActualizaPrecioDisponible event)->{
            producto.disponible.actializarPrecio(event.getPrecio());
        });

        apply((ActualizaCantidadPedido event)->{
            producto.pedido.actializarCantidad(event.getCantidad());
        });

        apply((ActualizaCantidadDisponible event)->{
            producto.disponible.actializarCantidad(event.getCantidad());
        });

    }
}
