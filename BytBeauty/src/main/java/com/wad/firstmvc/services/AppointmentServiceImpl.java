package com.wad.firstmvc.services;

import com.wad.firstmvc.domain.Appointment;
import com.wad.firstmvc.repositories.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Appointment save(Appointment f) {
        return appointmentRepository.save(f);
    }

    @Override
    public List<Appointment> findAll() {
        return (List<Appointment>) appointmentRepository.findAll();
    }

    @Override
    public List<Appointment> findAppointmentsByPhone(String name) {
        return appointmentRepository.findAppointmentsByPhone(name);
    }}


