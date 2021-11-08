package com.dawi.sysbus.models;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "viaje")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vj_id;
    private Date vj_fecha;
    private Time vj_hora_inicial;
    private Time vj_hora_final;
    private Time vj_hora_total;
    private Time vj_hora_frecuencia;
    private String vj_ruta;
    private String vj_lado;
    private int vj_nro_viaje;
    private int id_conductor;
    private int id_vehiculo;
	public int getVj_id() {
		return vj_id;
	}
	public void setVj_id(int vj_id) {
		this.vj_id = vj_id;
	}
	public Date getVj_fecha() {
		return vj_fecha;
	}
	public void setVj_fecha(Date vj_fecha) {
		this.vj_fecha = vj_fecha;
	}
	public Time getVj_hora_inicial() {
		return vj_hora_inicial;
	}
	public void setVj_hora_inicial(Time vj_hora_inicial) {
		this.vj_hora_inicial = vj_hora_inicial;
	}
	public Time getVj_hora_final() {
		return vj_hora_final;
	}
	public void setVj_hora_final(Time vj_hora_final) {
		this.vj_hora_final = vj_hora_final;
	}
	public Time getVj_hora_total() {
		return vj_hora_total;
	}
	public void setVj_hora_total(Time vj_hora_total) {
		this.vj_hora_total = vj_hora_total;
	}
	public Time getVj_hora_frecuencia() {
		return vj_hora_frecuencia;
	}
	public void setVj_hora_frecuencia(Time vj_hora_frecuencia) {
		this.vj_hora_frecuencia = vj_hora_frecuencia;
	}
	public String getVj_ruta() {
		return vj_ruta;
	}
	public void setVj_ruta(String vj_ruta) {
		this.vj_ruta = vj_ruta;
	}
	public String getVj_lado() {
		return vj_lado;
	}
	public void setVj_lado(String vj_lado) {
		this.vj_lado = vj_lado;
	}
	public int getVj_nro_viaje() {
		return vj_nro_viaje;
	}
	public void setVj_nro_viaje(int vj_nro_viaje) {
		this.vj_nro_viaje = vj_nro_viaje;
	}
	public int getId_conductor() {
		return id_conductor;
	}
	public void setId_conductor(int id_conductor) {
		this.id_conductor = id_conductor;
	}
	public int getId_vehiculo() {
		return id_vehiculo;
	}
	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
    
    
}
