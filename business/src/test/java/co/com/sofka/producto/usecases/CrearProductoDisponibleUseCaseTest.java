package co.com.sofka.producto.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.persona.usescases.CrearProductoDisponibleUseCase;
import co.com.sofka.producto.command.CrearProductoDisponibleCommand;
import co.com.sofka.producto.events.CrearProductoDisponible;
import co.com.sofka.producto.identities.DisponibleId;
import co.com.sofka.producto.identities.ProductoId;
import co.com.sofka.producto.values.Cantidad;
import co.com.sofka.producto.values.Precio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.lang.Integer.valueOf;

@ExtendWith(MockitoExtension.class)
class CrearProductoDisponibleUseCaseTest {

    @InjectMocks
    CrearProductoDisponibleUseCase useCase;

    @Mock
    DomainEventRepository domainEventRepository;

   @Test
    void CrearProductoDisponibleTest(){
       var disponibleId = DisponibleId.of("pd1");
       var productoId = ProductoId.of("p1");
       var nombre = new Nombre("Producto numero 1");
       var precio = new Precio(10000);
       var cantidad = new Cantidad(20);

       var command = new CrearProductoDisponibleCommand(productoId, disponibleId, nombre, precio, cantidad);

       var eventos = UseCaseHandler.getInstance()
               .syncExecutor(useCase, new RequestCommand<>(command))
               .orElseThrow()
               .getDomainEvents();

       var productoDisponibleCreado = (CrearProductoDisponible) eventos.get(0);

       Assertions.assertEquals("Producto numero 1", productoDisponibleCreado.getNombre().value());
       Assertions.assertEquals(Integer.valueOf(20000), productoDisponibleCreado.getPrecio());


   }
}