package com.dawi.sysbus.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.dawi.sysbus.models.Viaje;
import com.dawi.sysbus.service.IChoferService;
import com.dawi.sysbus.service.IDespachoService;
import com.dawi.sysbus.service.IVehiculoService;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.annotation.AuthenticationPrincipal;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.annotation.AuthenticationPrincipal;
// import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DespachoController {
	// @Autowired
	@Autowired
	IVehiculoService vehiculoService;
	@Autowired
	IChoferService choforService;
	@Autowired
	IDespachoService despachoService;

	@RequestMapping("/despachar")
	public String verDespacho(/*@AuthenticationPrincipal User user */){
		System.out.println("ejecutando el controlador Spring MVC");
		System.out.println("usuario que hizo login:" /*+ user*/);
		return "index";
	}

	@RequestMapping("/listaViajes")
	@ResponseBody
	public List<Viaje> listarViajes(){
		List<Viaje> lista = despachoService.listaViaje();
		return lista;
	}

	@RequestMapping("/registrarViaje")
	@ResponseBody
	public Map<String,Object> registrarViaje(Viaje obj){
		Map<String,Object> salida = new HashMap<String,Object>();
		System.out.println(salida);
		try {
			Viaje objResultado = despachoService.insertarActualizaViaje(obj);
			if(objResultado == null){
				salida.put("mensaje","Error al registrar");
			}else{
				List<Viaje> lista = despachoService.listaViaje();
				salida.put("mensaje","Registro exitoso");
				salida.put("data",lista);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salida;
	}

	@RequestMapping("/ActualizarViaje")
	public Map<String,Object> AcutualizaViaje(Viaje obj){
		Map<String,Object> salida = new HashMap<String,Object>();
		try {
			Viaje objResultado = despachoService.insertarActualizaViaje(obj);
			if(objResultado == null){
				salida.put("mensaje","Error al Actualizar");
			}else{
				List<Viaje> lista = despachoService.listaViaje();
				salida.put("mensaje","Registro exitoso");
				salida.put("data",lista);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return salida;
	}
	
	@RequestMapping("/eliminarViaje")
	@ResponseBody
	public Map<String,Object> eliminarViaje(String id) {
		Map<String,Object> salida = new HashMap<String,Object>();
		try {
			Optional<Viaje> optViaje = despachoService.obtinePorId(Integer.parseInt(id));
			if(optViaje.isEmpty()){
				salida.put("mesaje","No existe id");
			}else{
				vehiculoService.eliminarVehiculo(Integer.parseInt(id));
				List<Viaje>lista = despachoService.listaViaje();
				salida.put("lista", lista);
				salida.put("mensaje","eliminacion exitosa");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return salida;
	}


	



}
