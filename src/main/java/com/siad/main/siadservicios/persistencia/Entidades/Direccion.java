package com.siad.main.siadservicios.persistencia.Entidades;

import com.siad.main.siadservicios.persistencia.Entidades.Base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "T_Direccion")
public class Direccion extends BaseEntity{
  /**
   * Generame los atributos para este diagrama:
   * class Direccion {
   * -IdPersona : int
   * -Pais : string
   * -Departamento : string
   * -Provincia : string
   * -Distrito : string
   * -Numero : string
   * -Calle : string
   * -Referencia: string
   * }
   * Direccion --|> BaseEntity
   */
  @Column(name = "IdPersona", nullable = false)
  private Integer IdPersona;

  @Column(name = "Pais", nullable = false, length = 50)
  private String Pais;

  @Column(name = "Departamento", nullable = false, length = 50)
  private String Departamento;

  @Column(name = "Provincia", nullable = false, length = 50)
  private String Provincia;

  @Column(name = "Distrito", nullable = false, length = 50)
  private String Distrito;

  @Column(name = "Numero", nullable = false, length = 50)
  private String Numero;

  @Column(name = "Calle", nullable = false, length = 50)
  private String Calle;

  @Column(name = "Referencia", nullable = true, length = 200)
  private String Referencia;
}
