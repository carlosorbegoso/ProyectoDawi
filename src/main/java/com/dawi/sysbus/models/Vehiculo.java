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
	public int getVehiculo_codigo() {
		return Vehiculo_codigo;
	}
	public void setVehiculo_codigo(int vehiculo_codigo) {
		Vehiculo_codigo = vehiculo_codigo;
	}
	public String getVehiculo_placa() {
		return Vehiculo_placa;
	}
	public void setVehiculo_placa(String vehiculo_placa) {
		Vehiculo_placa = vehiculo_placa;
	}
	public String getVehiculo_marca() {
		return Vehiculo_marca;
	}
	public void setVehiculo_marca(String vehiculo_marca) {
		Vehiculo_marca = vehiculo_marca;
	}
	public String getVehiculo_modelo() {
		return Vehiculo_modelo;
	}
	public void setVehiculo_modelo(String vehiculo_modelo) {
		Vehiculo_modelo = vehiculo_modelo;
	}
	public String getVehiculo_color() {
		return Vehiculo_color;
	}
	public void setVehiculo_color(String vehiculo_color) {
		Vehiculo_color = vehiculo_color;
	}
	

	
}