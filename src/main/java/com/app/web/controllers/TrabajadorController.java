package com.app.web.controllers;

import com.app.web.entities.Trabajador;
import com.app.web.services.TrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({"/empresa","/"})
public class TrabajadorController {
    @Autowired
    private TrabajadorService trabajadorService;

    @GetMapping
    public String listTrabajadores(Model model){
        model.addAttribute("trabajadores",trabajadorService.getTrabajadores());
        return "empresaInicio";
    }

    @GetMapping("/nuevo")
    public String crearEmpleadoForm (Model model){
        Trabajador trabajador = new Trabajador();
        model.addAttribute("nuevotrabajador",trabajador);
        return "creartrabajador";
    }

    @PostMapping("/nuevo")
    public String creacionTrabajador (@ModelAttribute ("nuevotrabajador")Trabajador nuevotrabajador){
        trabajadorService.guardarTrabajador(nuevotrabajador);
        return "redirect:/empresa";
    }

    @GetMapping("/nuevo/{id}")
    public String editTrabajador (@PathVariable Integer id,Model model){
        model.addAttribute("nuevotrabajador",trabajadorService.trabajadorPorId(id));
        return "actualizartrabajador";
    }

    @PostMapping("/nuevo/{id}")
    public String trabajadorEdit (@PathVariable Integer id,@ModelAttribute ("nuevotrabajador") Trabajador trabajador, Model model){
        Trabajador trabajadorExistente = trabajadorService.trabajadorPorId(id);
        trabajadorExistente.setId(id);
        trabajadorExistente.setName(trabajador.getName());
        trabajadorExistente.setApellido(trabajador.getApellido());
        trabajadorExistente.setEmail(trabajador.getEmail());
        trabajadorService.actualizarTrabajador(trabajadorExistente);
        return "redirect:/empresa";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarTrabajador(@PathVariable Integer id){
        trabajadorService.eliminarTrabajador(id);
        return "redirect:/empresa";
    }
}
