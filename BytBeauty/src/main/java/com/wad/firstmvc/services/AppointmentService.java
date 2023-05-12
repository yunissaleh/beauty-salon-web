package com.wad.firstmvc.services;

import com.wad.firstmvc.domain.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> findAll();
    Appointment save(Appointment p);

    List<Appointment> findAppointmentsByPhone(String name);

}
