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
	public int getTr_id() {
		return tr_id;
	}
	public void setTr_id(int tr_id) {
		this.tr_id = tr_id;
	}
	public String getTr_codigo() {
		return tr_codigo;
	}
	public void setTr_codigo(String tr_codigo) {
		this.tr_codigo = tr_codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTr_apellidoP() {
		return tr_apellidoP;
	}
	public void setTr_apellidoP(String tr_apellidoP) {
		this.tr_apellidoP = tr_apellidoP;
	}
	public String getTr_apellidoM() {
		return tr_apellidoM;
	}
	public void setTr_apellidoM(String tr_apellidoM) {
		this.tr_apellidoM = tr_apellidoM;
	}
	public String getTr_dni() {
		return tr_dni;
	}
	public void setTr_dni(String tr_dni) {
		this.tr_dni = tr_dni;
	}
	public String getTr_telefono() {
		return tr_telefono;
	}
	public void setTr_telefono(String tr_telefono) {
		this.tr_telefono = tr_telefono;
	}
	public String getTr_lic_numero() {
		return tr_lic_numero;
	}
	public void setTr_lic_numero(String tr_lic_numero) {
		this.tr_lic_numero = tr_lic_numero;
	}
	public String getTr_lic_clase() {
		return tr_lic_clase;
	}
	public void setTr_lic_clase(String tr_lic_clase) {
		this.tr_lic_clase = tr_lic_clase;
	}
	public String getTr_lic_categoria() {
		return tr_lic_categoria;
	}
	public void setTr_lic_categoria(String tr_lic_categoria) {
		this.tr_lic_categoria = tr_lic_categoria;
	}
	public Date getTr_lic_fecha_expedicion() {
		return tr_lic_fecha_expedicion;
	}
	public void setTr_lic_fecha_expedicion(Date tr_lic_fecha_expedicion) {
		this.tr_lic_fecha_expedicion = tr_lic_fecha_expedicion;
	}
	public Date getTr_lic_fecha_revalidacion() {
		return tr_lic_fecha_revalidacion;
	}
	public void setTr_lic_fecha_revalidacion(Date tr_lic_fecha_revalidacion) {
		this.tr_lic_fecha_revalidacion = tr_lic_fecha_revalidacion;
	}
	

}
