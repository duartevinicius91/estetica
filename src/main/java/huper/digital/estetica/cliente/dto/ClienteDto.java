package huper.digital.estetica.cliente.dto;

import java.time.LocalDate;

public record ClienteDto(String nome, String telefone, String email, LocalDate nascimento) {
}
