package com.dawi.sysbus.models;

import javax.persistence.Column;
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
@Table(name = "vehiculos")
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehi_id ;
	@Column(name = "veh_codigo")
	private String codigo ;
	private String veh_nro_placa ;
	private String veh_nro_serie ;
	private String veh_nro_vin ;
	private String veh_nro_motor ;
	private String veh_color ;
	private String veh_marca ;
	private String veh_modelo ;
	private String vehi_placa_vigente ;
	private String vehi_placa_anterior ;
	private String vehi_estado ;
	private String vehi_anotaciones ;
	private String vehi_sede ;

	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pr_id")
	private Propietario propietario;

	public int getVehi_id() {
		return vehi_id;
	}

	public void setVehi_id(int vehi_id) {
		this.vehi_id = vehi_id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getVeh_nro_placa() {
		return veh_nro_placa;
	}

	public void setVeh_nro_placa(String veh_nro_placa) {
		this.veh_nro_placa = veh_nro_placa;
	}

	public String getVeh_nro_serie() {
		return veh_nro_serie;
	}

	public void setVeh_nro_serie(String veh_nro_serie) {
		this.veh_nro_serie = veh_nro_serie;
	}

	public String getVeh_nro_vin() {
		return veh_nro_vin;
	}

	public void setVeh_nro_vin(String veh_nro_vin) {
		this.veh_nro_vin = veh_nro_vin;
	}

	public String getVeh_nro_motor() {
		return veh_nro_motor;
	}

	public void setVeh_nro_motor(String veh_nro_motor) {
		this.veh_nro_motor = veh_nro_motor;
	}

	public String getVeh_color() {
		return veh_color;
	}

	public void setVeh_color(String veh_color) {
		this.veh_color = veh_color;
	}

	public String getVeh_marca() {
		return veh_marca;
	}

	public void setVeh_marca(String veh_marca) {
		this.veh_marca = veh_marca;
	}

	public String getVeh_modelo() {
		return veh_modelo;
	}

	public void setVeh_modelo(String veh_modelo) {
		this.veh_modelo = veh_modelo;
	}

	public String getVehi_placa_vigente() {
		return vehi_placa_vigente;
	}

	public void setVehi_placa_vigente(String vehi_placa_vigente) {
		this.vehi_placa_vigente = vehi_placa_vigente;
	}

	public String getVehi_placa_anterior() {
		return vehi_placa_anterior;
	}

	public void setVehi_placa_anterior(String vehi_placa_anterior) {
		this.vehi_placa_anterior = vehi_placa_anterior;
	}

	public String getVehi_estado() {
		return vehi_estado;
	}

	public void setVehi_estado(String vehi_estado) {
		this.vehi_estado = vehi_estado;
	}

	public String getVehi_anotaciones() {
		return vehi_anotaciones;
	}

	public void setVehi_anotaciones(String vehi_anotaciones) {
		this.vehi_anotaciones = vehi_anotaciones;
	}

	public String getVehi_sede() {
		return vehi_sede;
	}

	public void setVehi_sede(String vehi_sede) {
		this.vehi_sede = vehi_sede;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	
}