package com.dawi.sysbus.models;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="rol")
public class Rol {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;
    
    private String nombre;
}
