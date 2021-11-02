package com.dawi.sysbus.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "cargo")

public class Cargo {
    @Id
    private int car_id;
    private String nombre;
    private String detalle;
}
