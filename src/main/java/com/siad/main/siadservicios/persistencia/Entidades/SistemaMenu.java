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
@Table(name = "T_SistemaMenu")
public class SistemaMenu extends BaseEntity{
  /**
   * generame las propiedades de esta clase según esta clase puml:
   * class SistemaMenu {
   * -NombreMenu : string
   * -Descripcion : string
   * -Url: string
   * -Icono: string
   * }
   * SistemaMenu --|> BaseEntity   * 
   */
  @Column(name = "NombreMenu", nullable = false, length = 50)
  private String nombreMenu;

  @Column(name = "Descripcion", nullable = false, length = 100)
  private String descripcion;

  @Column(name = "Url", nullable = false, length = 200)
  private String url;

  @Column(name = "Icono", nullable = false, length = 50)
  private String icono;
}
