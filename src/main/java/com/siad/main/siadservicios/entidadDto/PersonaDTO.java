package com.siad.main.siadservicios.entidadDto;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class PersonaDTO {
  private Integer id;
  
  @NotNull(message = "")
  private String Nombres;
  
  @NotNull(message = "")
  private String apellidos;
  
  private String primerNombre;
  
  private String segundoNombre;

  private String apellidoPaterno;
  
  private String apellidoMaterno;
  
  @NotNull
  private String email;
  
  private String email2;  

  private String telefono;
  
  private String celular;
  
  @NotNull
  private String direccionCompleta;
  
  private Date fechaNacimiento;

  private Integer edad;
  
  private Integer idSexo;
  
  private String registroCivil;
  
  private String foto;
}
