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

  /**
   * generame las propiedades de esta clase según esta clase puml:
   * class Usuario {
   * -IdPersona : integer
   * -UserName : string
   * -PasswordHash : string
   * -Activo : Boolean
   * -EmailRecuperacion: string
   * -FechaExpiracion : string
   * -UltimoAcceso: DateTime
   * -Salt : string
   * -EsprimerAcceso: boolean
   * -IdRol: int
   * }
   */
  @Column(name = "IdPersona", nullable = false)
  private int IdPersona;

  @Column(name = "IdRol", nullable = false)
  private int IdRol;

  @Column(name = "UserName", unique = true, nullable = false, length = 50)
  private String UserName;

  @Column(name = "PasswordHash", nullable = false, length = 50)
  private String PasswordHash;

  @Column(name = "Activo", nullable = false)
  private boolean Activo;

  @Column(name = "EmailRecuperacion", nullable = true, length = 100)
  private String EmailRecuperacion;

  @Column(name = "FechaExpiracion", nullable = true)
  private String FechaExpiracion;

  @Column(name = "UltimoAcceso", nullable = true)
  private String UltimoAcceso;

  @Column(name = "Salt", nullable = false, length = 50)
  private String Salt;

  @Column(name = "EsPrimerAcceso" , nullable = false)
  private boolean EsPrimerAcceso;

  @Column(name = "PasswordTemp" , nullable = true, length =50)
  private String PasswordTemp;
}