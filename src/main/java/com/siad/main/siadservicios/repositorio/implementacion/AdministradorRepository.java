package com.siad.main.siadservicios.repositorio.implementacion;

import com.siad.main.siadservicios.persistencia.Entidades.Administrador;
import com.siad.main.siadservicios.repositorio.implementacion.base.BaseRepository;
import com.siad.main.siadservicios.repositorio.interfaces.IAdministradorRepository;

public class AdministradorRepository extends BaseRepository<Administrador, Integer> implements IAdministradorRepository {
  public AdministradorRepository(){
    super(Administrador.class);
  }
}
