package com.dawi.sysbus.service;

import java.util.List;
import java.util.Optional;

import com.dawi.sysbus.models.Vehiculo;

public interface IVehiculoService {
    public abstract List<Vehiculo>listaVehiculo();	
	public abstract Vehiculo insertarActualizaVehiculo(Vehiculo obj);
	public abstract Optional<Vehiculo> obtinePorId(int tr_id);
	public abstract void eliminarVehiculo(int id);
	public abstract List<Vehiculo>listaChoferPorCodigolike(String string);
}
