package com.dawi.sysbus.service;

import java.util.List;
import java.util.Optional;

import com.dawi.sysbus.models.Viaje;
import com.dawi.sysbus.repository.IDespachoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DespachoSeviceImple implements IDespachoService{
    @Autowired
     IDespachoRepository repository;


    @Override
    public List<Viaje> listaViaje() {
        
        return repository.findAll();
    }

    @Override
    public Viaje insertarActualizaViaje(Viaje obj) {
       
        return repository.save(obj);
    }

    @Override
    public Optional<Viaje> obtinePorId(int id) {
      
        return repository.findById(id);
    }

    @Override
    public void eliminarViaje(int id) {
        repository.deleteById(id);
        
    }

     
}
