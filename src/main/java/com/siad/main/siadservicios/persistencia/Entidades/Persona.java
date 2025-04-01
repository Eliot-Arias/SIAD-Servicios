package com.siad.main.siadservicios.persistencia.Entidades;

import java.util.Date;

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
@Table(name = "T_Persona")
/**
 * Representa una entidad Persona en el sistema, almacenando información
 * personal básica y de contacto.
 * <p>
 * Mapeada a la tabla "T_Persona" en la base de datos y hereda campos comunes de
 * {@link BaseEntity}.
 * </p>
 *
 * @author Jorge
 * @version 1.0
 * @since 2023-10-25
 */
public class Persona extends BaseEntity {
  /**
   * class Persona {
   * -Nombres : string
   * -Apellidos : string
   * -PrimerNombre: string
   * -SegundoNombre: string
   * -ApellidoPaterno: string
   * -ApellidoMaterno: string
   * -Email: string
   * -Email2: string
   * -Telefono: string
   * -Celular: string
   * -DireccionCompleta: string
   * -FechaNacimiento : int
   * -Edad : int
   * -IdSexo: int
   * -EstadoCivil: int
   * -Foto: string
   * }
   */
  @Column(name = "Nombres", nullable = false, length = 50)
  private String nombres;

  @Column(name = "Apellidos", nullable = false, length = 50)
  private String apellidos;

  @Column(name = "PrimerNombre", nullable = true, length = 50)
  private String primerNombre;

  @Column(name = "SegundoNombre", nullable = true, length = 50)
  private String segundoNombre;

  @Column(name = "ApellidoPaterno", nullable = true, length = 50)
  private String apellidoPaterno;

  @Column(name = "ApellidoMaterno", nullable = true, length = 50)
  private String apellidoMaterno;

  @Column(name = "Email", nullable = true, length = 100, unique = true)
  private String email;

  @Column(name = "Email2", nullable = true, length = 100)
  private String email2;

  @Column(name = "Telefono", nullable = true, length = 15)
  private String telefono;

  @Column(name = "Celular", nullable = true, length = 15)
  private String celular;

  @Column(name = "DireccionCompleta", nullable = true, length = 200)
  private String direccionCompleta;

  @Column(name = "FechaNacimiento", nullable = true)
  private Date fechaNacimiento;

  @Column(name = "Edad", nullable = true)
  private Integer edad;

  @Column(name = "IdSexo", nullable = true)
  private Integer idSexo;

  @Column(name = "EstadoCivil", nullable = true)
  private String registroCivil;

  @Column(name = "Foto", nullable = true, length = 200)
  private String foto;
}