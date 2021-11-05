package com.dawi.sysbus.models;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name = "viaje")
@Entity
public class Viaje {
    @Id
    private int vj_id;
    private Date vj_fecha;
    private Time vj_hora_inicial;
    private Time vj_hora_final;
    private Time vj_hora_total;
    private Time vj_hora_frecuencia;
    private String vj_ruta;
    private String vj_lado;
    private int vj_nro_viaje;
    private String id_conductor;
    private String id_vehiculo;
    
    
}
