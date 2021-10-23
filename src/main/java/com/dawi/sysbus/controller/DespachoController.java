package com.dawi.sysbus.controller;

import com.dawi.sysbus.models.Trabajador;
import com.dawi.sysbus.repository.ITrabajadorRepositroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DespachoController {
    @Autowired
    private ITrabajadorRepositroy repoTrabajador;
    @GetMapping("/despacho")
    public String cargarTrabajador(Model model) {
        model.addAttribute("trabajador",new Trabajador());
        // genera listado de vehiculos
        model.addAttribute("listaVehiculo",repoTrabajador.findAll());
        return "despacho";
    }

}
