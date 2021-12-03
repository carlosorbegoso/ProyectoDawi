package com.dawi.sysbus.repository;

import java.util.List;
import com.dawi.sysbus.models.Viaje;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDespachoRepository extends JpaRepository<Viaje, Integer> {
  public List<Viaje> findByFecha(String fecha);

}
