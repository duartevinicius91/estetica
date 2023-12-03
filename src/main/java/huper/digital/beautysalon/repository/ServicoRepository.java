package huper.digital.beautysalon.repository;

import huper.digital.beautysalon.entity.ServicoEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class ServicoRepository implements PanacheRepository<ServicoEntity> {

    public List<ServicoEntity> findByName(String name){
        return list("nome like ?1", "%"+name+"%");
    }

}
