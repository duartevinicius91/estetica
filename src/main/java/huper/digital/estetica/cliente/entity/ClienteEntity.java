package huper.digital.estetica.cliente.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class ClienteEntity {
  @Id
  @GeneratedValue
  private Long id;
  private String nome;
  private String telefone;
  private String email;
}
