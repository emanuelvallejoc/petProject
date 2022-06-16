package co.com.sofka.producto;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.producto.identities.DisponibleId;
import co.com.sofka.producto.identities.PedidoId;
import co.com.sofka.producto.values.Cantidad;
import co.com.sofka.producto.values.Precio;

public class Pedido extends Entity<PedidoId> {

    protected Precio precio;

    protected Cantidad cantidad;

    protected Nombre nombre;

    public Pedido(PedidoId entityId, Nombre nombre, Precio precio, Cantidad cantidad) {
        super(entityId);
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Pedido(PedidoId entityId) {
        super(entityId);
    }

    public static Disponible from(DisponibleId entityId, Nombre nombre, Precio precio, Cantidad cantidad){

        var disponible = new Disponible(entityId);

        disponible.nombre = nombre;
        disponible.precio = precio;
        disponible.cantidad = cantidad;

        return disponible;
    }

    public String nombre() {
        return nombre.value();
    }

    public Integer precio() {
        return precio.value();
    }

    public Integer cantidad()  { return cantidad.value();  }

    public void actualizarNombre(Nombre nombre) { this.nombre = nombre; }

    public void actializarPrecio(Precio precio) { this.precio = precio; }

    public void actializarCantidad(Cantidad cantidad) { this.cantidad = cantidad; }
}
