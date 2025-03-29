package com.siad.main.siadservicios.persistencia.Entidades.Base;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad base para todos los objetos de la base de datos.
 * Con los datos de auditoria
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    @CreatedBy
    @Column(name = "usuarioCreacion", nullable = false)
    private String usuarioCreacion;

    @LastModifiedBy
    @Column(name = "usuarioModificacion", nullable = false)
    private String usuarioModificacion;

    @CreatedDate
    @Column(name = "fechaCreacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @LastModifiedDate
    @Column(name = "fechaModificacion", nullable = false)
    private LocalDateTime fechaModificacion;
}
