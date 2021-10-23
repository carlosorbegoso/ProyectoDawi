package com.dawi.sysbus.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Ruta")
public class Ruta {
	
	@Id
	private int ruta_codigo;
	private String ruta_nombre;
	private String ruta_tipo;
}
