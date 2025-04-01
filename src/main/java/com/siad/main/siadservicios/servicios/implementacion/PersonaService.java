package com.siad.main.siadservicios.servicios.implementacion;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siad.main.siadservicios.entidadDto.PersonaDTO;
import com.siad.main.siadservicios.entidadDto.Validacion.RespuestaDTO;
import com.siad.main.siadservicios.persistencia.Entidades.Persona;
import com.siad.main.siadservicios.repositorio.interfaces.IPersonaRepository;
import com.siad.main.siadservicios.servicios.interfaces.IPersonaService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PersonaService implements IPersonaService {

  @Autowired
  private IPersonaRepository personaRepository;

  @Autowired
  private ModelMapper mapper;

  @Override
  public List<PersonaDTO> obtenerTodo() {
    try {
      List<Persona> results = personaRepository.obtenerTodos();
      return results.stream()
          .map(result -> mapper.map(
              result, PersonaDTO.class))
          .collect(Collectors.toList());
    } catch (Exception e) {
      throw new RuntimeException("Error en Obtener Todo", e);
    }
  }

  @Override
  public PersonaDTO obtnerPorId(Integer id) {
    throw new UnsupportedOperationException("Unimplemented method 'obtnerPorId'");
  }

  @Override
  public RespuestaDTO crearPersona(PersonaDTO personadDto) {
    try {
      // mapper.typeMap(PersonaDTO.class, Persona.class)
      // .addMappings(m -> m.skip(Persona::setId));

      // Persona ValidarEmail =
      // personaRepository.ObtenerPersonaPorEmail(personadDto.getEmail());
      // if (ValidarEmail != null) {
      // return RespuestaDTO.builder()
      // .exito(false)
      // .mensaje("Ya existe un registro con el email, ingrese un correo
      // diferente").build();
      // }
      // Persona personaNueva = mapper.map(personadDto, Persona.class);

      // personaNueva.setUsuarioCreacion("prueba");
      // personaNueva.setUsuarioModificacion("prueba");
      // personaNueva.setEstado(true);
      // Persona persona = personaRepository.crear(personaNueva);
      // return mapper.map(persona, PersonaDTO.class);
      return RespuestaDTO.builder()
          .exito(true)
          .mensaje("Persona creada correctamente").build();
    } catch (Exception e) { 
      throw new RuntimeException("Error en Crear Persona", e);
    }
  }

  @Override
  public PersonaDTO actualizarPersona(Persona persona) {
    throw new UnsupportedOperationException("Unimplemented method 'actualizarPersona'");
  }

  @Override
  public void borrarPersona(Persona persona) {
    throw new UnsupportedOperationException("Unimplemented method 'borrarPersona'");
  }

}
