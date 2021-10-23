package com.dawi.sysbus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dawi.sysbus.models.Ruta;
import com.dawi.sysbus.repository.IRutaRepository;

public class RutaController {
	
	@Autowired
	private IRutaRepository repoRuta;
	
	@GetMapping("/ruta")
	public String cargarRuta(Model model) {
        model.addAttribute("ruta", new Ruta());
        return "ruta";
    }
}
