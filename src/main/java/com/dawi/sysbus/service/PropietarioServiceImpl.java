package com.dawi.sysbus.service;

import java.util.List;

import com.dawi.sysbus.models.Propietario;
import com.dawi.sysbus.repository.IPropietarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropietarioServiceImpl implements IPropietarioService{
    @Autowired
    IPropietarioRepository repository;
    @Override
    public List<Propietario> listaPropietario() {
        return repository.findAll();
    }
    
}
