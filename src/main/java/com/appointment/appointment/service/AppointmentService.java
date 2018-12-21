package com.appointment.appointment.service;

import com.appointment.appointment.model.Appointment;

import java.util.List;


public interface AppointmentService {

    //save the given appointment in  parameter
    Appointment saveAppointment(Appointment appointment);

    //save list of appointments given in  parameter
    List<Appointment> saveAllAppointments(Iterable<Appointment> appointments);

}
