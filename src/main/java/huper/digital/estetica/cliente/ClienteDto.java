package huper.digital.estetica.cliente;

import java.time.LocalDate;

public record ClienteDto(String nome, String telefone, String email, LocalDate nascimento) {
}
