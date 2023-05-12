package com.wad.firstmvc.controllers;


import com.wad.firstmvc.services.AppointmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }


    //-populate the model with the retrieved products!
    //-select the appropriate view (navigation)
    @GetMapping
    public String viewProducts(Model model){
        model.addAttribute("appointments",appointmentService.findAll());
        return "appointments";
    }

    @GetMapping("/new")
    public String showAddProductForm(Model model){
        model.addAttribute("appointment",new com.wad.firstmvc.domain.Appointment());
        return "addappointments";
    }

    @PostMapping("/new")
    public String addProduct(com.wad.firstmvc.domain.Appointment appointment){
        if(appointment.getId()==null)
            appointment.setId(new Random().nextLong());
        appointmentService.save(appointment);
        return "redirect:/appointments";
    }

}
