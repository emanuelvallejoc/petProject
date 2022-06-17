package co.com.sofka.persona.usescases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.producto.Producto;
import co.com.sofka.producto.command.CrearProductoPedidoCommand;

public class CrearProductoPedidoUseCase extends UseCase<RequestCommand<CrearProductoPedidoCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearProductoPedidoCommand> input) {

        var command = input.getCommand();
        var producto = new Producto(command.getProductoId(), command.getPedidoId(),
                command.getNombre(), command.getPrecio(), command.getCantidad());

        emit().onResponse(new ResponseEvents(producto.getUncommittedChanges()));

    }

}
