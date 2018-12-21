package com.appointment.appointment.model;


import lombok.*;
import lombok.EqualsAndHashCode.Exclude;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Appointment implements Serializable {

    private long id;
    @Exclude
    private String type;
    @Exclude
    private Date date;
    @Exclude
    private int price;
    @Exclude
    private Organization organization;

}
