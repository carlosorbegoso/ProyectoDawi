package com.dawi.sysbus.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DespachoController {
    // @Autowired

    @GetMapping("/despachar")
	public String cargarRuta(Model model) {
        // model.addAttribute("ruta", new Ruta());
        return "despacho";
    }
    // private ITrabajadorRepositroy repoTrabajador;
    // @GetMapping("/despacho")
    // public String cargarTrabajador(Model model) {
    //     model.addAttribute("trabajador",new Trabajador());
    //     // genera listado de vehiculos
    //     model.addAttribute("listaVehiculo",repoTrabajador.findAll());
    //     return "despacho";
    // }

}
