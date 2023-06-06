package com.wad.firstmvc.controllers;

import com.wad.firstmvc.domain.Appointment;
import com.wad.firstmvc.services.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
@RequestMapping("/api/app/")
@RequiredArgsConstructor
public class RestController {

    private final AppointmentService appointmentService;


    @GetMapping("/{id}")
    public ResponseEntity<?> confirm(@PathVariable("id") Long id){
        Optional<Appointment> a = appointmentService.findById(id);
        if (a.isPresent()) {
            Appointment app = a.get();
            app.setIsAccepted(true);
            appointmentService.save(app);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/d/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        appointmentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
