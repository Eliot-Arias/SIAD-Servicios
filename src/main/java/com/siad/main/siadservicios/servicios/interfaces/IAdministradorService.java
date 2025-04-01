package com.siad.main.siadservicios.servicios.interfaces;

import java.util.List;

import com.siad.main.siadservicios.entidadDto.AdministradorDTO;
import com.siad.main.siadservicios.persistencia.Entidades.Administrador;



public interface IAdministradorService {
  public List<AdministradorDTO> obtenerTodo();

  public AdministradorDTO obtnerPorId(Integer id);

  public AdministradorDTO crearAdministrador(AdministradorDTO adminDTO);

  public AdministradorDTO actualizarAdministrador(Administrador admin);

  public void borrarAdministrador(Administrador admin);
}
