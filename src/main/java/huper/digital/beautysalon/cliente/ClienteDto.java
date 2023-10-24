package huper.digital.beautysalon.cliente;

import java.time.LocalDate;

public record ClienteDto(String nome, String telefone, String email, LocalDate nascimento) {
}
