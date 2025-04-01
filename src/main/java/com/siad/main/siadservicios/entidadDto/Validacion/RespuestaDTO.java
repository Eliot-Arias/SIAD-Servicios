package com.siad.main.siadservicios.entidadDto.Validacion;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RespuestaDTO {
  private String mensaje;
  private boolean exito;
  private List<DetalleErrorDto> listaErrores;
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
class  DetalleErrorDto{
  private String campo;
  private String mensaje;  
}