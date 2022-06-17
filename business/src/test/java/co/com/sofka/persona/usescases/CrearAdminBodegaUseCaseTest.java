package co.com.sofka.persona.usescases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.generics.values.Nombre;
import co.com.sofka.persona.command.CrearAdministradorDeBodegaCommand;
import co.com.sofka.persona.event.AdministradorBodegaCreado;
import co.com.sofka.persona.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CrearAdminBodegaUseCaseTest {

    @InjectMocks
    CrearAdminBodegaUseCase useCase;

    @Mock
    DomainEventRepository domainEventRepository;

   @Test
    void CrearAdminBodegaTest(){
       var id = AdministradorBodegaId.of("xyz1");
       var personaId = PersonaId.of("sdasdasdsad");
       var nombre = new Nombre("persona");
       var tipoDocumento = new TipoDocumento(TipoDocumento.Types.CEDULA_CIUDADANIA) ;
       var numero = NumeroDocumento.of("1059874") ;
       var email = Email.of("yo@hotmail.com");

       var command = new CrearAdministradorDeBodegaCommand(personaId, id, nombre, tipoDocumento, numero, email);

       var eventos = UseCaseHandler.getInstance()
               .syncExecutor(useCase, new RequestCommand<>(command))
               .orElseThrow()
               .getDomainEvents();

       var adminCreado = (AdministradorBodegaCreado) eventos.get(0);

       Assertions.assertEquals("persona", adminCreado.getNombre().value());
       Assertions.assertEquals("xyz1", adminCreado.getAdministradorBodegaId().value());


   }
}