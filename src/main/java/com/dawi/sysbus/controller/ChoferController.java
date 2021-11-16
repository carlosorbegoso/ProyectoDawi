package com.dawi.sysbus.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.dawi.sysbus.models.Chofer;
import com.dawi.sysbus.service.IChoferService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ChoferController {

	@Autowired
	private IChoferService choferService;

	@RequestMapping("/chofer")
	public String verInicio(){
		return "chofer";
	}
	@RequestMapping("/consultarChofer")
	@ResponseBody
	public List<Chofer> consultaChofer(String filtro){
		List<Chofer> lista = choferService.listaChoferPorNombrelike("%"+filtro+"%");
		return lista;
	}
	@RequestMapping("registrarChofer")
	@ResponseBody
	public Map<String, Object> registarChofer(Chofer obj){
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			Chofer objResultado = choferService.insertarActualizaChofer(obj);
			if(objResultado == null){
				salida.put("mensaje", "Error al registrar");
			}else{
				List<Chofer> lista = choferService.listaChofer();
				salida.put("mensaje", "Registro exitoso");
				salida.put("data",lista);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salida;
	}

	@RequestMapping("actualizarChofer")
	@ResponseBody
	public Map<String, Object> actualizarChofer(Chofer obj){
		Map<String, Object> salida =  new HashMap<String,Object>();
		try {
			Chofer objResultado = choferService.insertarActualizaChofer(obj);
			if(objResultado == null){
				salida.put("mensaje", "Error al actualizar");
			}else{
				List<Chofer> lista = choferService.listaChofer();
				salida.put("mensaje", "Actualizado exitoso");
				salida.put("data",lista);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salida;
	}

	@RequestMapping("/eliminarChofer")
	@ResponseBody
	public Map<String, Object> eliminaChofer(String id){
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			Optional<Chofer> optChofer = choferService.obtinePorId(Integer.parseInt(id));
			if(optChofer.isEmpty()){
				salida.put("mensaje","No existe el id");
			}else{
				choferService.eliminarChofer(Integer.parseInt(id));
				List<Chofer> lista = choferService.listaChofer();
				salida.put("lista",lista);
				salida.put("mensaje","eliminacion  exitosa");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salida;
	}


		

	
}
