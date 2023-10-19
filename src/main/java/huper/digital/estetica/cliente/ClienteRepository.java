package huper.digital.estetica.cliente;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
class ClienteRepository implements PanacheRepository<ClienteEntity> {

  public ClienteEntity findByName(String name){
    return find("nome", name).firstResult();
  }

}
