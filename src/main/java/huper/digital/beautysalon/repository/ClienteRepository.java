package huper.digital.beautysalon.repository;

import huper.digital.beautysalon.entity.ClienteEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<ClienteEntity> {

  public ClienteEntity findByName(String name){
    return find("nome", name).firstResult();
  }

}
