package huper.digital.beautysalon.dto;

import java.time.LocalDate;

public record ClienteDto(String nome, String telefone, String email, LocalDate nascimento) {
}
