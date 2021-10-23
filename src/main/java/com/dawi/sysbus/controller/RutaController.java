package com.dawi.sysbus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dawi.sysbus.models.Ruta;
import com.dawi.sysbus.repository.IRutaRepository;

@Controller
public class RutaController {
	
	@Autowired
	private IRutaRepository repoRuta;
	
	@GetMapping("/ruta")
	public String cargarRuta(Model model) {
        model.addAttribute("ruta", new Ruta());
        return "ruta";
    }
	
	@PostMapping("/Rgrabar")
	public String grabarPag(@ModelAttribute Ruta ruta) {
		System.out.println(ruta);
		repoRuta.save(ruta);
		return "ruta";
	}
}
