package com.dawi.sysbus.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.dawi.sysbus.models.Propietario;
import com.dawi.sysbus.models.Vehiculo;
import com.dawi.sysbus.service.IPropietarioService;
import com.dawi.sysbus.service.IVehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class VehiculoController {
	@Autowired
    private IVehiculoService vehiculoService;
    @Autowired
    private IPropietarioService propietarioService;
	
    @RequestMapping("/vehiculo")
    public String verVehiculo(){
        return "vehiculo";
    }
    @RequestMapping("/listaPropietarios")
    @ResponseBody
    public List<Propietario> listaPropietarios(){
        List<Propietario> lista = propietarioService.listaPropietario();         
        return lista;
    }

    @RequestMapping("/consultaVehiculo")
    @ResponseBody
    public List<Vehiculo> consultaVehiculo(String filtro){
        List<Vehiculo> lista = vehiculoService.listaChoferPorCodigolike("%"+filtro+"%");
        return lista;
    }
    @RequestMapping("registrarVehiculo")
    @ResponseBody
    public Map<String,Object> registrarVehiculo(Vehiculo obj){
        Map<String,Object> salida = new HashMap<String, Object>();
        try {
            Vehiculo objResultado = vehiculoService.insertarActualizaVehiculo(obj);
            if(objResultado == null){
                salida.put("mensaje","Error al registar");
            }else{
                List<Vehiculo> lista = vehiculoService.listaVehiculo();
                salida.put("mensaje","Registro exitoso");
                salida.put("data",lista);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salida;
    }
    @RequestMapping("actualizarVehiculo")
    @ResponseBody
    public Map<String, Object> actualizarVehiculo(Vehiculo obj){
        Map<String, Object> salida = new HashMap<String, Object>();
        try {
            Vehiculo objResutado = vehiculoService.insertarActualizaVehiculo(obj);
            if(objResutado == null){
                salida.put("mensaje","Error al actualizar");
            }else{
                List<Vehiculo> lista = vehiculoService.listaVehiculo();
                salida.put("mensaje","Actualizado correctamente");
                salida.put("data",lista);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salida;
    }
    @RequestMapping("/eliminarVehiculo")
    @ResponseBody
    public Map<String, Object> eliminarVehiculo(String id){
        Map<String, Object> salida = new HashMap<String, Object>();
        try {
            Optional<Vehiculo> optVehiculo = vehiculoService.obtinePorId(Integer.parseInt(id));
            if(optVehiculo.isEmpty()){
                salida.put("mensaje","No existe el id");
            }else{
                vehiculoService.eliminarVehiculo(Integer.parseInt(id));
                List<Vehiculo> lista = vehiculoService.listaVehiculo();
                salida.put("lista",lista);
                salida.put("mensaje","Elimninacion exitosa");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salida;
    }


}
