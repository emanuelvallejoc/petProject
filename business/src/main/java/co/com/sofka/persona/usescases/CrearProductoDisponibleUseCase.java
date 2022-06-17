package co.com.sofka.persona.usescases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.producto.Producto;
import co.com.sofka.producto.command.CrearProductoDisponibleCommand;

public class CrearProductoDisponibleUseCase extends UseCase<RequestCommand<CrearProductoDisponibleCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearProductoDisponibleCommand> input) {

        var command = input.getCommand();
        var producto = new Producto(command.getProductoId(), command.getDisponibleId(),
                command.getNombre(), command.getPrecio(), command.getCantidad());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));

    }

}
