package com.dawi.sysbus.repository;
import java.util.List;
import com.dawi.sysbus.models.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehiculoRepository extends JpaRepository<Vehiculo,Integer>{
    public List<Vehiculo>findByCodigoLike(String filtro); 
}
