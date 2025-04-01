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
@Table(name = "T_Rol")
public class Rol extends BaseEntity{

  /*
   * Entidad Rol con los siguientes atributos:
   * class Rol {
   * -NombreRol : string
   * -Descripcion : string
   * }
   * Rol --|> BaseEntity
   */
  @Column(name = "NombreRol", nullable = false, length = 50)
  private String nombreRol;

  @Column(name = "Descripcion", nullable = false, length = 100)
  private String descripcion;
}
