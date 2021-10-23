package com.dawi.sysbus.controller;

import com.dawi.sysbus.models.Vehiculo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculoController {
    @GetMapping("/vehiculo")
    public String cargarTrabajador(Model model) {
        model.addAttribute("trabajador",new Vehiculo());
        return "vehiculo";
    }
}
