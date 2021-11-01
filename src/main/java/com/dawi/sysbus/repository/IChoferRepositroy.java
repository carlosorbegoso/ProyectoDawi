package com.dawi.sysbus.repository;

import java.util.List;

import com.dawi.sysbus.models.Chofer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IChoferRepositroy extends JpaRepository<Chofer, Integer> {
    public List<Chofer>findByNombreLike(String filtro);    
}
