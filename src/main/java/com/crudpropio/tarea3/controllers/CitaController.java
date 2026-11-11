package com.crudpropio.tarea3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crudpropio.tarea3.models.Cita;
import com.crudpropio.tarea3.models.Dentista;
import com.crudpropio.tarea3.services.CitaService;

@Controller
public class CitaController {

    @Autowired
    private CitaService service;

    @GetMapping("/")
    public String listar (Model model){
        model.addAttribute("citas", service.listar());
        return "index";
    }

    @GetMapping("/nuevo")
    public String nuevo (Model model){
        Cita cita = new Cita();
        cita.setDentista(new Dentista());
        model.addAttribute("cita", cita);
        model.addAttribute("dentistas", service.listarDentistas());
        return "form";
    }

    @PostMapping("/guardar")
    public String guardar (@ModelAttribute Cita cita){
        service.guardar(cita);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar (@PathVariable Long id, Model model){
        Cita cita = service.buscarPorId(id).orElse(null);
        model.addAttribute ("cita", cita);
        model.addAttribute("dentistas", service.listarDentistas());
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar (@PathVariable Long id){
        service.eliminar(id);
        return "redirect:/";
    }
}