package huper.digital.estetica.cliente.repository;

import huper.digital.estetica.cliente.entity.ClienteEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<ClienteEntity> {

  public ClienteEntity findByName(String name){
    return find("nome", name).firstResult();
  }

}
