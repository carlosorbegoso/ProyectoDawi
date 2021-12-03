package com.dawi.sysbus.service;

import java.util.List;
import java.util.Optional;

import com.dawi.sysbus.models.Viaje;

public interface IDespachoService {
    public abstract List<Viaje>listaViaje();
    public abstract Viaje insertarActualizaViaje(Viaje obj);
    public abstract Optional<Viaje> obtinePorId(int id);
    public abstract void eliminarViaje(int id);
    public abstract List<Viaje> listarViajePorFecha(String fecha);
  
}
