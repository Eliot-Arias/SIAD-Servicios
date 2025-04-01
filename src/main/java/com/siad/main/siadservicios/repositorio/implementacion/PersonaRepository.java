package com.siad.main.siadservicios.repositorio.implementacion;

import org.springframework.stereotype.Repository;

import com.siad.main.siadservicios.persistencia.Entidades.Persona;
import com.siad.main.siadservicios.repositorio.implementacion.base.BaseRepository;
import com.siad.main.siadservicios.repositorio.interfaces.IPersonaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class PersonaRepository extends BaseRepository<Persona, Integer> implements IPersonaRepository {
  public PersonaRepository() {
    super(Persona.class);
  }

  @Override
  public Persona ObtenerPersonaPorEmail(String email) {

    try {
      EntityManager em = super.getEntityManager();

      TypedQuery<Persona> query = em.createQuery("Select * from T_Persona p where p.email = :email", Persona.class);

      query.setParameter("email", email);

      return query.getSingleResult();

    } catch (Exception e) {
      throw new RuntimeException("Error al obtener persona por email", e);
    }    
  }
}
