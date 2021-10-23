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
	
	public int getTrabajador_codigo() {
		return Trabajador_codigo;
	}
	public void setTrabajador_codigo(int trabajador_codigo) {
		Trabajador_codigo = trabajador_codigo;
	}
	public String getTrabajador_nombre() {
		return Trabajador_nombre;
	}
	public void setTrabajador_nombre(String trabajador_nombre) {
		Trabajador_nombre = trabajador_nombre;
	}
	public String getTrabajador_apellidos() {
		return Trabajador_apellidos;
	}
	public void setTrabajador_apellidos(String trabajador_apellidos) {
		Trabajador_apellidos = trabajador_apellidos;
	}
	public String getTrabajador_dni() {
		return Trabajador_dni;
	}
	public void setTrabajador_dni(String trabajador_dni) {
		Trabajador_dni = trabajador_dni;
	}
	public String getTrabajador_cargo() {
		return Trabajador_cargo;
	}
	public void setTrabajador_cargo(String trabajador_cargo) {
		Trabajador_cargo = trabajador_cargo;
	}
	public String getTrabajador_telefono() {
		return Trabajador_telefono;
	}
	public void setTrabajador_telefono(String trabajador_telefono) {
		Trabajador_telefono = trabajador_telefono;
	}
}
