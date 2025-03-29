package com.siad.main.siadservicios.persistencia.Entidades;

import com.siad.main.siadservicios.persistencia.Entidades.Base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "T_Usuario")
public class Usuario extends BaseEntity {

  @Column(name = "NombreUsuario", unique = true, nullable = false, length = 50)
  private String nombreUsuario;

  @Column(name = "Contrasena", nullable = false, length = 50)
  private String contrasena;

  

  @Column(name = "IdPersonal", nullable = false, length = 50)
  private int IdPersona;

}