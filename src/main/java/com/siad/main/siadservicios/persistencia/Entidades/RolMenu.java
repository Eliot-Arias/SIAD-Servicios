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
@Table(name = "T_RolMenu")
public class RolMenu extends BaseEntity{
  /**
   * Propiedades de la clase segun el diagrama
   * class RolMenu {
   * -IdRol: integer
   * -IdSistemaMenu: integer
   * }
   * RolMenu --|> BaseEntity
   */
  
  @Column(name = "IdRol", nullable = false)
  private Integer idRol;

  @Column(name = "IdSistemaMenu", nullable = false)
  private Integer idSistemaMenu;  
}
