package com.dawi.sysbus.service;

import java.util.List;
import java.util.Optional;

import com.dawi.sysbus.models.Chofer;
import com.dawi.sysbus.repository.IChoferRepositroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ChoferServiceImpl implements IChoferService {
    @Autowired
    IChoferRepositroy repository;
    @Override
    
    public List<Chofer> listaChofer() {
    
        return repository.findAll();
    }

    @Override
    public Chofer insertarActualizaChofer(Chofer obj) {
   
        return repository.save(obj);
    }

    @Override
    public Optional<Chofer> obtinePorId(int tr_id) {
     
        return repository.findById(tr_id);
    }

    @Override
    public void eliminarChofer(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Chofer> listaChoferPorNombrelike(String obj) {
 
        return repository.findByNombreLike(obj);
        
    }
    
}
