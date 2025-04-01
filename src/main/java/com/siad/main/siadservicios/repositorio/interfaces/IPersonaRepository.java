package com.siad.main.siadservicios.repositorio.interfaces;



import com.siad.main.siadservicios.persistencia.Entidades.Persona;
import com.siad.main.siadservicios.repositorio.interfaces.base.IBaseRepository;

public interface IPersonaRepository extends IBaseRepository<Persona, Integer>{
  Persona ObtenerPersonaPorEmail(String email);
}
