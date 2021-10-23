package com.dawi.sysbus.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Trabajador")
public class Trabajador {

    @Id
    private int		Trabajador_codigo;

	private String	Trabajador_nombre;
	private String	Trabajador_apellidos;
	private String	Trabajador_dni;
	private String	Trabajador_cargo;
	private String	Trabajador_telefono;
}
