package huper.digital.beautysalon.service;

import huper.digital.beautysalon.entity.ServicoEntity;
import huper.digital.beautysalon.repository.ClienteRepository;
import huper.digital.beautysalon.repository.ServicoRepository;
import huper.digital.beautysalon.resource.ClienteResource;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Map;

@ApplicationScoped
public class ServicoService {

    private final ServicoRepository repository;

    public ServicoService(ServicoRepository repository) {
        this.repository = repository;
    }

    public ServicoEntity get(Long id) {
        return repository.findById(id);
    }

    public List<ServicoEntity> list(Page page) {
        return repository.findAll().page(page).list();
    }

    public ServicoEntity add(ServicoEntity newCliente) {
        repository.persist(newCliente);
        return newCliente;
    }

    public List<ServicoEntity> findByName(String name) {
        return repository.findByName(name);
    }
}
