package com.dawi.sysbus.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name = "propietario")

public class Propietario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pr_id;
	private String pr_codigo;
	private String pr_nombre;
	private String pr_apellidoP;
	private String pr_apellidoM;
	private String pr_dni;
	private String pr_telefono;
	private String pr_correo;

	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "car_id")
	private Cargo cargo;

	public int getPr_id() {
		return pr_id;
	}

	public void setPr_id(int pr_id) {
		this.pr_id = pr_id;
	}

	public String getPr_codigo() {
		return pr_codigo;
	}

	public void setPr_codigo(String pr_codigo) {
		this.pr_codigo = pr_codigo;
	}

	public String getPr_nombre() {
		return pr_nombre;
	}

	public void setPr_nombre(String pr_nombre) {
		this.pr_nombre = pr_nombre;
	}

	public String getPr_apellidoP() {
		return pr_apellidoP;
	}

	public void setPr_apellidoP(String pr_apellidoP) {
		this.pr_apellidoP = pr_apellidoP;
	}

	public String getPr_apellidoM() {
		return pr_apellidoM;
	}

	public void setPr_apellidoM(String pr_apellidoM) {
		this.pr_apellidoM = pr_apellidoM;
	}

	public String getPr_dni() {
		return pr_dni;
	}

	public void setPr_dni(String pr_dni) {
		this.pr_dni = pr_dni;
	}

	public String getPr_telefono() {
		return pr_telefono;
	}

	public void setPr_telefono(String pr_telefono) {
		this.pr_telefono = pr_telefono;
	}

	public String getPr_correo() {
		return pr_correo;
	}

	public void setPr_correo(String pr_correo) {
		this.pr_correo = pr_correo;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}
