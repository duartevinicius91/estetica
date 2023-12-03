package huper.digital.beautysalon.mapper;

import huper.digital.beautysalon.dto.ClienteDto;
import huper.digital.beautysalon.entity.ClienteEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
interface ClienteMapper {
  ClienteDto toDto(ClienteEntity person);
}
