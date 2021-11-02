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

	
}