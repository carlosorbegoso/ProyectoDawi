package com.dawi.sysbus.controller;

import com.dawi.sysbus.models.Trabajador;
import com.dawi.sysbus.repository.ITrabajadorRepositroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrabajadorController {
    @Autowired
    private ITrabajadorRepositroy repoTrabajador;
        
    @GetMapping("/trabajador")
    public String cargarTrabajador(Model model) {
        model.addAttribute("trabajador",new Trabajador());
        return "trabajador";
    }


    @PostMapping("/Tguardar")
    public String grabarPag(@ModelAttribute Trabajador t, Model model){
        System.out.println(t);
        repoTrabajador.save(t);
        model.addAttribute("listaTrabajador",repoTrabajador.findAll());

        return "trabajador.listar";
    }

    @GetMapping("/Tlistar")
    public String listadoTrabajador(@ModelAttribute Trabajador trabajador,Model model){
        model.addAttribute("listaTrabajador",repoTrabajador.findAll());
        return "trabajador.listar";
    }

    @PostMapping("/Teditar")
    public String buscarTrabajador(@ModelAttribute Trabajador t, Model model){
        System.out.println(t);
        model.addAttribute("trabajador",repoTrabajador.findById(t.getTrabajador_codigo()));
        return "trabajador";
    }
    @PostMapping("/Teliminar")
    public String eliminarTrabajador(@ModelAttribute Trabajador t,Model model){
        // System.out.println(t);
        repoTrabajador.delete(t);
        model.addAttribute("listaTrabajador",repoTrabajador.findAll());
       
        // buscarTrabajador(Trabajador,trabajador);
        return "trabajador.listar";
    }
    
}
