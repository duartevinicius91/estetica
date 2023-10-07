package huper.digital.estetica.cliente.service;

import huper.digital.estetica.cliente.entity.ClienteEntity;
import huper.digital.estetica.cliente.repository.ClienteRepository;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class ClienteService {

  private final ClienteRepository clienteRepository;

  public ClienteService(ClienteRepository clienteRepository) {
    this.clienteRepository = clienteRepository;
  }

  public ClienteEntity get(Long id) {
    return clienteRepository.findById(id);
  }

  public List<ClienteEntity> list(Page page) {
    return clienteRepository.findAll().page(page).list();
  }

  public ClienteEntity add(ClienteEntity newCliente) {
    clienteRepository.persist(newCliente);
    return newCliente;
  }
}
