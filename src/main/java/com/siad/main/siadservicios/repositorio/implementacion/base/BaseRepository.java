package com.siad.main.siadservicios.repositorio.implementacion.base;

import java.util.List;
import java.util.Optional;
import com.siad.main.siadservicios.repositorio.interfaces.base.IBaseRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Getter;

/**
 * Clase genérica para operaciones CRUD.
 * Cada repositorio concreto extenderá de esta clase
 * y proveerá la clase de la entidad y el tipo de ID.
 */
@Getter
public abstract class BaseRepository<T, ID> implements IBaseRepository<T, ID> {

  @PersistenceContext
  private EntityManager entityManager;

  private Class<T> entityClass;

  protected BaseRepository(Class<T> entityClass) {
    this.entityClass = entityClass;
  }

  /**
   * Funcion base para guardar cualquier entidad
   * 
   * @author Jorge
   * @version 1.0
   * @since 2025-03-30
   * @return entity
   */
  @Override
  public T crear(T entity) {
    entityManager.persist(entity);
    return entity;
  }

  /**
   * Funcion base para actualizar cualquier entidad
   * 
   * @author Jorge
   * @version 1.0
   * @since 2025-03-30
   * @return entity
   */
  @Override
  public T actualizar(T entity) {
    return entityManager.merge(entity);
  }

  /**
   * Funcion base para obtener cualquier entidad
   * 
   * @author Jorge
   * @version 1.0
   * @since 2025-03-30
   * @return entity of null
   */
  @Override
  public Optional<T> obtenerPorId(ID id) {
    return Optional.ofNullable(entityManager.find(entityClass, id));
  }

  /**
   * Funcion base para obtener todos los datos de una entidad
   * 
   * @author Jorge
   * @version 1.0
   * @since 2025-03-30
   * @return List<entity>
   */
  @Override
  @SuppressWarnings("unchecked")
  public List<T> obtenerTodos() {
    String jpql = "SELECT e FROM " + entityClass.getSimpleName() + " e WHERE e.estado = true";
    return entityManager.createQuery(jpql).getResultList();
  }

  /**
   * Funcion base para actualizar el campo estado a 0 (softDelete)
   * 
   * @author Jorge
   * @version 1.0
   * @since 2025-03-30   
   */
  @Override
  public void eliminar(T entity) {
    // Se hara un sofdelete actualizando el campo Estado de cada entiedad
    try {
      entity.getClass().getMethod("SetEstado", Boolean.class).invoke(entity, false);

      entityManager.merge(entity);
      
    } catch (Exception e) {
      throw new RuntimeException("Error al borrar el dato, o ya fue borrado anteriormente", e);
    }
  }
}
