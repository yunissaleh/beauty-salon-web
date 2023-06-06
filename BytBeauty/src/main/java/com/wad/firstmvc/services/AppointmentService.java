package com.wad.firstmvc.services;

import com.wad.firstmvc.domain.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {
    List<Appointment> findAll();
    Appointment save(Appointment p);

    Optional<Appointment> findById(Long id);

    void deleteById(Long id);
}
