package huper.digital.beautysalon.cliente;

import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
interface ClienteMapper {
  ClienteDto toDto(ClienteEntity person);
}
