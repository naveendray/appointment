package com.appointment.appointment.controller;

import com.appointment.appointment.model.Appointment;
import com.appointment.appointment.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @PostMapping(value = "/save")
    public @ResponseBody
    void saveAppointment(@RequestBody() Appointment appointment){

        System.out.println(appointmentService.saveAppointment(appointment) + "saved-------------");

    }

}
