package com.wad.firstmvc.controllers;


import com.wad.firstmvc.domain.Appointment;
import com.wad.firstmvc.domain.User;
import com.wad.firstmvc.services.AppointmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@Slf4j
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }


    //-populate the model with the retrieved products!
    //-select the appropriate view (navigation)
    @GetMapping
    public String viewProducts(Model model, Authentication authentication){
        model.addAttribute("appointments",appointmentService.findAll());
        User user = (User) authentication.getPrincipal();
        log.info(user.getUsername());
        return "appointments";
    }

    @GetMapping("/new")
    public String showAddProductForm(Model model){
        model.addAttribute("appointment",new Appointment());
        return "addappointments";
    }

    @PostMapping("/new")
    public String addProduct(Appointment appointment){
        if(appointment.getId()==null)
            appointment.setId(new Random().nextLong());
        appointment.setIsAccepted(false);
        appointment.setDisplayOptions(true);
        appointmentService.save(appointment);
        return "redirect:/";
    }

}
