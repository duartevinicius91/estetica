package huper.digital.beautysalon.resource;

import huper.digital.beautysalon.entity.ServicoEntity;
import huper.digital.beautysalon.service.ServicoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Collections;
import java.util.List;

@Path("/servico")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ServicoResource {

    @Inject
    ServicoService service;

    @GET
    @Path("/name/{name}")
    public List<ServicoEntity> findByName(@PathParam("name") String name) {
        return service.findByName(name);
    }
}
