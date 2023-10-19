package huper.digital.estetica.cliente;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "servico")
@Data
public class ServicoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private BigDecimal valor;
  private String email;
  private LocalDate nascimento;
}
