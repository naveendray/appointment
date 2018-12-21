package com.appointment.appointment.controller;

import com.appointment.appointment.model.Appointment;
import com.appointment.appointment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
public class HomeController {

    @Autowired
    AppointmentRepository appointmentRepository;

    Set<Appointment> appointments = new HashSet<Appointment>();

    @GetMapping(value = "/")
    public Set<Appointment> getIndexPage(){
       appointments.addAll(appointmentRepository.findAll());
        return appointments;
    }


    @PostMapping("/addAll")
    public @ResponseBody
    void addAllApointments(@RequestBody()Set<Appointment> appois){
        appointments.addAll(appois);
        for (Appointment a: appointments
             ) {
            System.out.println(appointmentRepository.save(a));
        }
    }

}
