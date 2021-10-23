package com.dawi.sysbus.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "vehiculos")
public class Vehiculo {

	@Id
	private int		Vehiculo_codigo;
	private String	Vehiculo_placa;
	private String	Vehiculo_marca;
	private String	Vehiculo_modelo;
	private String	Vehiculo_color;
	

	
}