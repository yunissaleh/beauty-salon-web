package com.wad.firstmvc.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment {

    @Id
    @GeneratedValue
    private Long id;
    private String fname;
    private String lname;
    private String phone;
    private String email;
    private String service;

    private String date;


    private Boolean isAccepted;
    private Boolean displayOptions;



}
