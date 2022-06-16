package co.com.sofka.producto;

import co.com.sofka.domain.generic.Identity;

public class ProductoId extends Identity {

    private ProductoId(String id){ super(id); }

    private ProductoId() { super(); }

    public static ProductoId of(String id) { return new ProductoId(id); }
}
