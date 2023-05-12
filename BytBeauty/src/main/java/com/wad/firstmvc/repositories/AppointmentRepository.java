package com.wad.firstmvc.repositories;

import com.wad.firstmvc.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentRepository extends CrudRepository<Appointment,Long> {

    List<Appointment> findAppointmentsByPhone(String name);

}
