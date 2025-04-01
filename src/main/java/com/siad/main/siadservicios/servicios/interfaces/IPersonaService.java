package com.siad.main.siadservicios.servicios.interfaces;

import java.util.List;

import com.siad.main.siadservicios.entidadDto.PersonaDTO;
import com.siad.main.siadservicios.entidadDto.Validacion.RespuestaDTO;
import com.siad.main.siadservicios.persistencia.Entidades.Persona;

public interface IPersonaService {
  public List<PersonaDTO> obtenerTodo();

  public PersonaDTO obtnerPorId(Integer id);

  public RespuestaDTO crearPersona(PersonaDTO personaDTO);

  public PersonaDTO actualizarPersona(Persona persona);

  public void borrarPersona(Persona persona);
}
