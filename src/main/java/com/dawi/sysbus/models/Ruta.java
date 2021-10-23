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
	
	public int getRuta_codigo() {
		return ruta_codigo;
	}
	public void setRuta_codigo(int ruta_codigo) {
		this.ruta_codigo = ruta_codigo;
	}
	public String getRuta_nombre() {
		return ruta_nombre;
	}
	public void setRuta_nombre(String ruta_nombre) {
		this.ruta_nombre = ruta_nombre;
	}
	public String getRuta_tipo() {
		return ruta_tipo;
	}
	public void setRuta_tipo(String ruta_tipo) {
		this.ruta_tipo = ruta_tipo;
	}
	
	
}
