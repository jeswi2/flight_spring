package com.nestdigital.flightbackend.controller;

import com.nestdigital.flightbackend.Model.FlightModel;
import com.nestdigital.flightbackend.dao.FlightDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addflight", consumes = "application/json", produces = "application/json")
    public String viewflight(@RequestBody FlightModel flight) {
        System.out.println(flight.toString());
        dao.save((flight));
        return "{status:'successs'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewflight")
    public List<FlightModel> allflight() {
        return (List<FlightModel>) dao.findAll();

    }
@Transactional
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deleteflight",consumes = "application/json",produces = "application/json")
    public String deleteflight(@RequestBody FlightModel flight) {
        dao.deleteflightId((flight.getId()));
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchflight",consumes = "application/json",produces = "application/json")
    public List<FlightModel> searchflight(@RequestBody FlightModel flight){
        return (List<FlightModel>) dao.searchflight(flight.getOrigin());
    }
}