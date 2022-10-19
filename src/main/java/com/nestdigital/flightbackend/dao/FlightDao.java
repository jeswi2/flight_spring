package com.nestdigital.flightbackend.dao;

import com.nestdigital.flightbackend.Model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}
