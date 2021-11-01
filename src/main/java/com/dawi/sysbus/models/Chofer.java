package com.dawi.sysbus.models;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "conductor")
public class Chofer {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tr_id;
	
	private String tr_codigo;  
	@Column(name = "tr_nombre")
    private String nombre;  
	private String tr_apellidoP; 
    private String tr_apellidoM; 
	private String tr_dni;  
	private String tr_telefono; 
	private String tr_lic_numero; 
	private String tr_lic_clase; 
	private String tr_lic_categoria;

	// @DateTimeFormat(pattern = "yyyy-MM-dd")
	// @Temporal(TemporalType.DATE)
	private Date tr_lic_fecha_expedicion;
	// @Temporal(TemporalType.DATE)
	// @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date tr_lic_fecha_revalidacion;

}
