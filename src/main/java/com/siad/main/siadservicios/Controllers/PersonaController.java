package com.siad.main.siadservicios.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siad.main.siadservicios.entidadDto.PersonaDTO;
import com.siad.main.siadservicios.servicios.implementacion.PersonaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Persona")
public class PersonaController {

  // Métodos para gestionar personas
  @Autowired
  private PersonaService personaService;


  @GetMapping("Saludo")
  public ResponseEntity<String> saludo(){
    return ResponseEntity.ok("Hola Mundo");
  }

  @PostMapping("CrearPersona")
  public ResponseEntity<?> crearPersona(@Valid @RequestBody PersonaDTO personaDTO, BindingResult result){

    if (result.hasErrors()) {
      Map<String, String> errores = new HashMap<>();
            result.getFieldErrors().forEach(error -> {
                errores.put(error.getField(), error.getDefaultMessage());
            });
            return ResponseEntity.badRequest().body(errores);
    }

    return ResponseEntity.ok(personaService.crearPersona(personaDTO));
    //return ResponseEntity.ok(personaDTO);
  }


  @GetMapping("ObtenerTodos")
  public ResponseEntity<Iterable<PersonaDTO>> obtenerTodos(){
    return ResponseEntity.ok(personaService.obtenerTodo());
  }


  
}
