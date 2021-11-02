package com.dawi.sysbus.service;

import java.util.List;
import java.util.Optional;

import com.dawi.sysbus.models.Vehiculo;
import com.dawi.sysbus.repository.IVehiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServiceImpl  implements IVehiculoService{
	@Autowired
	IVehiculoRepository repository;
	@Override
	public List<Vehiculo> listaVehiculo() {
		return repository.findAll();
	}

	@Override
	public Vehiculo insertarActualizaVehiculo(Vehiculo obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<Vehiculo> obtinePorId(int id) {
		return repository.findById(id);
	}

	@Override
	public void eliminarVehiculo(int id) {
		repository.deleteById(id); 
	}

	@Override
	public List<Vehiculo> listaChoferPorCodigolike(String string) {
		return repository.findByCodigoLike(string); 
	}
	
}
