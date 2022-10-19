package com.nestdigital.flightbackend.controller;

import com.nestdigital.flightbackend.Model.FlightModel;
import com.nestdigital.flightbackend.dao.FlightDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addflight",consumes = "application/json",produces = "application/json")
    public String viewflight(@RequestBody FlightModel flight){
        System.out.println(flight.toString());
        dao.save((flight));
        return  "{status:'successs'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewflight")
    public List<FlightModel> allflight(){
        return (List<FlightModel>) dao.findAll();
    }
}
