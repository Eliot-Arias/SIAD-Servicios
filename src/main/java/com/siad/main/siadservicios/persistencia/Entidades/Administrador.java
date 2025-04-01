package com.siad.main.siadservicios.persistencia.Entidades;

import java.util.Date;

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
@Table(name = "T_Administrador")
public class Administrador extends BaseEntity{
/**
 * generame las propiedades de esta clase según esta clase puml:
 * class Administrador {
 * -IdPersona : integer
 * -Cargo : string
 * -Dependencia : string
 * -FechaInicioCargo : Date
 * -FechaFinCargo : Date
 * -Observaciones : string
 * -Activo: boolean
 * -EsPersonalTemporal: boolean
 * }
 */
  @Column(name = "IdPersona", nullable = false)
  private Integer IdPersona;

  @Column(name = "Cargo", nullable = false, length = 50)
  private String Cargo;

  @Column(name = "Dependencia", nullable = false, length = 50)
  private String Dependencia;

  @Column(name = "FechaInicioCargo", nullable = false)
  private Date FechaInicioCargo;

  @Column(name = "FechaFinCargo", nullable = false)
  private Date FechaFinCargo;

  @Column(name = "Observaciones", nullable = false, length = 200)
  private String Observaciones;

  @Column(name = "Activo", nullable = false)
  private boolean Activo;

  @Column(name = "EsPersonalTemporal", nullable = false)
  private boolean EsPersonalTemporal;
}
