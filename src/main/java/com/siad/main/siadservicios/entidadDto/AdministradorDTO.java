package com.siad.main.siadservicios.entidadDto;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class AdministradorDTO {

  private Integer Id;
  private Integer IdPersona;
  private String Cargo;
  private String Dependencia;
  private Date FechaInicioCargo;
  private Date FechaFinCargo;
  private String Observaciones;
  private boolean Activo;
  private boolean EsPersonalTemporal;
  
}
