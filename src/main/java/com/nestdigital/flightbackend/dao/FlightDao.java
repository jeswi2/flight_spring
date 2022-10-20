package com.nestdigital.flightbackend.dao;

import com.nestdigital.flightbackend.Model.FlightModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
@Modifying
@Query(value = "DELETE FROM `flights` WHERE `id`=:id",nativeQuery = true)
void deleteflightId(Integer id);

}
