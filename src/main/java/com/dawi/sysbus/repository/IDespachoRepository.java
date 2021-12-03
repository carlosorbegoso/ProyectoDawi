package com.dawi.sysbus.repository;

import com.dawi.sysbus.models.Viaje;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDespachoRepository extends JpaRepository<Viaje, Integer> {
    // Viaje findByUsername(String username);
    
}
