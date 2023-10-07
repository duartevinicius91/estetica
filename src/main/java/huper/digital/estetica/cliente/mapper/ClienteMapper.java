package huper.digital.estetica.cliente.mapper;

import huper.digital.estetica.cliente.dto.ClienteDto;
import huper.digital.estetica.cliente.entity.ClienteEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ClienteMapper {
  ClienteDto toDto(ClienteEntity person);
}
