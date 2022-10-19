package com.nestdigital.flightbackend.controller;

import com.nestdigital.flightbackend.Model.FlightModel;
import com.nestdigital.flightbackend.dao.FlightDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @Autowired
    private FlightDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addflight",consumes = "application/json",produces = "application/json")
    public String addflight(@RequestBody FlightModel flight){
        System.out.println(flight.toString());
        dao.save((flight));
        return  "{status:'success'}";
    }
}
