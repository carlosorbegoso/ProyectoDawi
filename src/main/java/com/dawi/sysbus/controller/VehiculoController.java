package com.dawi.sysbus.controller;

import com.dawi.sysbus.models.Vehiculo;
import com.dawi.sysbus.repository.IVehiculoRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VehiculoController {
	
    @Autowired
    private IVehiculoRepository repoVehiculo;

    @GetMapping("/vehiculo")
    public String cargarTrabajador(Model model) {
        model.addAttribute("vehiculo",new Vehiculo());
        return "vehiculo";
    }
    
    @GetMapping("/listarV")
    public String listadoTrabajador(@ModelAttribute Vehiculo v,Model model){
        model.addAttribute("listaVehiculoss",repoVehiculo.findAll());
        return "vehiculo.listar";
    }

    @PostMapping("/editarV")
    public String buscarVehiculo(@ModelAttribute Vehiculo v, Model model){
        System.out.println(v);
        model.addAttribute("vehiculo",repoVehiculo.findById(v.getVehiculo_codigo()));
        return "vehiculo";
    }

	
	@PostMapping("/grabarV")
	public String grabarVehiculo(@ModelAttribute Vehiculo v,Model model) {
		System.out.println(v);
		repoVehiculo.save(v);
		
        model.addAttribute("listaVehiculoss",repoVehiculo.findAll());
		return "vehiculo.listar";
	}
	
    @PostMapping("/eliminarV")
    public String eliminarVehiculo(@ModelAttribute Vehiculo vehiculo,Model model){
       
    	repoVehiculo.delete(vehiculo);
        model.addAttribute("listaVehiculoss",repoVehiculo.findAll());
        return "vehiculo.listar";
    }

}
