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

}
