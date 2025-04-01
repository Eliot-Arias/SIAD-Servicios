package com.siad.main.siadservicios.repositorio.interfaces.base;

import java.util.List;
import java.util.Optional;

public interface IBaseRepository<T, ID> {

  T crear(T entity);

  T actualizar(T entity);

  Optional<T> obtenerPorId(ID id);

  List<T> obtenerTodos();

  void eliminar(T entity);
}
