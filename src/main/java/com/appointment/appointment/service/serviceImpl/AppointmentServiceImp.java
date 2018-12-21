package com.appointment.appointment.service.serviceImpl;

import com.appointment.appointment.model.Appointment;
import com.appointment.appointment.repository.AppointmentRepository;
import com.appointment.appointment.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AppointmentServiceImp implements AppointmentService {

 @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        appointment.setDate(new Date());
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> saveAllAppointments(Iterable<Appointment> appointments) {
        return appointmentRepository.saveAll(appointments);
    }
}