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
@Table(name = "T_AccesoMenu")
public class AccesoMenu extends BaseEntity{
  /**
   * Genereame los parametros para esta clase:
   * class AccesoMenu{
   * -IdPersona : integer
   * -IdSistemaMenu : integer
   * }
   * AccesoMenu --|> BaseEntity
   */
  @Column(name = "IdUsuario", nullable = false)
  private Integer IdUsuario;

  @Column(name = "IdSistemaMenu", nullable = false)
  private Integer IdSistemaMenu;
}
